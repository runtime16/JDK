/*
 * Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package sun.nio.ch;

import java.io.*;
import java.net.*;
import java.nio.channels.*;


// Make a server-socket channel look like a server socket.
//
// The methods in this class are defined in exactly the same order as in
// java.net.ServerSocket so as to simplify tracking future changes to that
// class.
//

public class ServerSocketAdaptor                        // package-private
    extends ServerSocket
{

    // The channel being adapted
    private final ServerSocketChannelImpl ssc;

    // Timeout "option" value for accepts
    private volatile int timeout;

    public static ServerSocket create(ServerSocketChannelImpl ssc) {
        try {
            return new ServerSocketAdaptor(ssc);
        } catch (IOException x) {
            throw new Error(x);
        }
    }

    // ## super will create a useless impl
    private ServerSocketAdaptor(ServerSocketChannelImpl ssc)
        throws IOException
    {
        this.ssc = ssc;
    }


    public void bind(SocketAddress local) throws IOException {
        bind(local, 50);
    }

    public void bind(SocketAddress local, int backlog) throws IOException {
        if (local == null)
            local = new InetSocketAddress(0);
        try {
            ssc.bind(local, backlog);
        } catch (Exception x) {
            Net.translateException(x);
        }
    }

    public InetAddress getInetAddress() {
        if (!ssc.isBound())
            return null;
        return Net.getRevealedLocalAddress(ssc.localAddress()).getAddress();

    }

    public int getLocalPort() {
        if (!ssc.isBound())
            return -1;
        return Net.asInetSocketAddress(ssc.localAddress()).getPort();
    }


    public Socket accept() throws IOException {
        synchronized (ssc.blockingLock()) {
            try {
                if (!ssc.isBound())
                    throw new NotYetBoundException();
                if (timeout == 0) {
                    SocketChannel sc = ssc.accept();
                    if (sc == null && !ssc.isBlocking())
                        throw new IllegalBlockingModeException();
                    return sc.socket();
                }

                ssc.configureBlocking(false);
                try {
                    SocketChannel sc;
                    if ((sc = ssc.accept()) != null)
                        return sc.socket();
                    long to = timeout;
                    for (;;) {
                        if (!ssc.isOpen())
                            throw new ClosedChannelException();
                        long st = System.currentTimeMillis();
                        int result = ssc.poll(Net.POLLIN, to);
                        if (result > 0 && ((sc = ssc.accept()) != null))
                            return sc.socket();
                        to -= System.currentTimeMillis() - st;
                        if (to <= 0)
                            throw new SocketTimeoutException();
                    }
                } finally {
                    if (ssc.isOpen())
                        ssc.configureBlocking(true);
                }

            } catch (Exception x) {
                Net.translateException(x);
                assert false;
                return null;            // Never happens
            }
        }
    }

    public void close() throws IOException {
        ssc.close();
    }

    public ServerSocketChannel getChannel() {
        return ssc;
    }

    public boolean isBound() {
        return ssc.isBound();
    }

    public boolean isClosed() {
        return !ssc.isOpen();
    }

    public void setSoTimeout(int timeout) throws SocketException {
        this.timeout = timeout;
    }

    public int getSoTimeout() throws SocketException {
        return timeout;
    }

    public void setReuseAddress(boolean on) throws SocketException {
        try {
            ssc.setOption(StandardSocketOptions.SO_REUSEADDR, on);
        } catch (IOException x) {
            Net.translateToSocketException(x);
        }
    }

    public boolean getReuseAddress() throws SocketException {
        try {
            return ssc.getOption(StandardSocketOptions.SO_REUSEADDR).booleanValue();
        } catch (IOException x) {
            Net.translateToSocketException(x);
            return false;       // Never happens
        }
    }

    public String toString() {
        if (!isBound())
            return "ServerSocket[unbound]";
        return "ServerSocket[addr=" + getInetAddress() +
            //          ",port=" + getPort() +
                ",localport=" + getLocalPort()  + "]";
    }

    public void setReceiveBufferSize(int size) throws SocketException {
        // size 0 valid for ServerSocketChannel, invalid for ServerSocket
        if (size <= 0)
            throw new IllegalArgumentException("size cannot be 0 or negative");
        try {
            ssc.setOption(StandardSocketOptions.SO_RCVBUF, size);
        } catch (IOException x) {
            Net.translateToSocketException(x);
        }
    }

    public int getReceiveBufferSize() throws SocketException {
        try {
            return ssc.getOption(StandardSocketOptions.SO_RCVBUF).intValue();
        } catch (IOException x) {
            Net.translateToSocketException(x);
            return -1;          // Never happens
        }
    }

}
