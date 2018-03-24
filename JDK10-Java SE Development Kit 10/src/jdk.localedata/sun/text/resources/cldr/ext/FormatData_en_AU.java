/*
 * Copyright (c) 2012, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (C) 1991-2016 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in 
 * http://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that
 * (a) this copyright and permission notice appear with all copies 
 * of the Data Files or Software,
 * (b) this copyright and permission notice appear in associated 
 * documentation, and
 * (c) there is clear notice in each modified Data File or in the Software
 * as well as in the documentation associated with the Data File(s) or
 * Software that the data or software has been modified.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_en_AU extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthAbbreviations = new String[] {
               "Jan.",
               "Feb.",
               "Mar.",
               "Apr.",
               "May",
               "Jun.",
               "Jul.",
               "Aug.",
               "Sep.",
               "Oct.",
               "Nov.",
               "Dec.",
               "",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "Sun.",
               "Mon.",
               "Tue.",
               "Wed.",
               "Thu.",
               "Fri.",
               "Sat.",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "Su.",
               "M.",
               "Tu.",
               "W.",
               "Th.",
               "F.",
               "Sa.",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "am",
               "pm",
            };
        final Object[][] data = new Object[][] {
            { "roc.DayAbbreviations", metaValue_DayAbbreviations },
            { "standalone.DayNarrows", metaValue_DayNarrows },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "islamic.AmPmMarkers", metaValue_AmPmMarkers },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "islamic.DayNarrows", metaValue_DayNarrows },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthNarrows", metaValue_MonthAbbreviations },
            { "islamic.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "DayNarrows", metaValue_DayNarrows },
            { "japanese.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.MonthNarrows", metaValue_MonthAbbreviations },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "roc.DayNarrows", metaValue_DayNarrows },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "roc.AmPmMarkers", metaValue_AmPmMarkers },
            { "islamic.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "d/M/yy",
                }
            },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "e",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "MonthNarrows", metaValue_MonthAbbreviations },
            { "japanese.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "roc.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "field.dayperiod", "am/pm" },
            { "standalone.MonthNarrows", metaValue_MonthAbbreviations },
            { "japanese.MonthNarrows", metaValue_MonthAbbreviations },
            { "roc.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
        };
        return data;
    }
}
