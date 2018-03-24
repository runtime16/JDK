package sun.launcher.resources;

import java.util.ListResourceBundle;

public final class launcher_zh_HK extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "java.launcher.X.macosx.usage", "\n\u4E0B\u5217\u662F Mac OS X \u7279\u5B9A\u9078\u9805:\n    -XstartOnFirstThread\n                      \u5728\u7B2C\u4E00\u500B (AppKit) \u57F7\u884C\u7DD2\u57F7\u884C main() \u65B9\u6CD5\n    -Xdock:name=<application name>\n                      \u8986\u5BEB\u7D50\u5408\u8AAA\u660E\u756B\u9762\u4E2D\u986F\u793A\u7684\u9810\u8A2D\u61C9\u7528\u7A0B\u5F0F\u540D\u7A31\n    -Xdock:icon=<path to icon file>\n                      \u8986\u5BEB\u7D50\u5408\u8AAA\u660E\u756B\u9762\u4E2D\u986F\u793A\u7684\u9810\u8A2D\u5716\u793A\n\n" },
            { "java.launcher.X.usage", "\n    -Xbatch           \u505C\u7528\u80CC\u666F\u7DE8\u8B6F\n    -Xbootclasspath/a:<\u4EE5 {0} \u5340\u9694\u7684\u76EE\u9304\u548C zip/jar \u6A94\u6848>\n                      \u9644\u52A0\u81F3\u555F\u52D5\u5B89\u88DD\u985E\u5225\u8DEF\u5F91\u7684\u7D50\u5C3E\n    -Xcheck:jni       \u57F7\u884C\u984D\u5916\u7684 JNI \u51FD\u6578\u6AA2\u67E5\n    -Xcomp            \u5F37\u5236\u7DE8\u8B6F\u7B2C\u4E00\u500B\u547C\u53EB\u7684\u65B9\u6CD5\n    -Xdebug           \u91DD\u5C0D\u56DE\u6EAF\u76F8\u5BB9\u6027\u63D0\u4F9B\n    -Xdiag            \u986F\u793A\u984D\u5916\u7684\u8A3A\u65B7\u8A0A\u606F\n    -Xfuture          \u555F\u7528\u6700\u56B4\u683C\u7684\u6AA2\u67E5\uFF0C\u9810\u5148\u4F5C\u70BA\u5C07\u4F86\u7684\u9810\u8A2D\n    -Xint             \u50C5\u9650\u89E3\u8B6F\u6A21\u5F0F\u57F7\u884C\n    -Xinternalversion\n                      \u986F\u793A\u6BD4 -version \u9078\u9805\u66F4\u70BA\u8A73\u7D30\u7684\n                      JVM \u7248\u672C\u8CC7\u8A0A\n    -Xloggc:<file>    \u9023\u540C\u6642\u6233\u5C07 GC \u72C0\u614B\u8A18\u9304\u81F3\u6A94\u6848\n    -Xmixed           \u6DF7\u5408\u6A21\u5F0F\u57F7\u884C (\u9810\u8A2D)\n    -Xmn<size>        \u8A2D\u5B9A\u65B0\u751F\u4EE3 (\u990A\u6210\u5340) \u4E4B\u5806\u96C6\u7684\u8D77\u59CB\u5927\u5C0F\u548C\n                      \u5927\u5C0F\u4E0A\u9650 (\u4F4D\u5143\u7D44)\n    -Xms<size>        \u8A2D\u5B9A\u8D77\u59CB Java \u5806\u96C6\u5927\u5C0F\n    -Xmx<size>        \u8A2D\u5B9A Java \u5806\u96C6\u5927\u5C0F\u4E0A\u9650\n    -Xnoclassgc       \u505C\u7528\u985E\u5225\u8CC7\u6E90\u56DE\u6536\n    -Xrs              \u6E1B\u5C11 Java/VM \u4F7F\u7528\u7684\u4F5C\u696D\u7CFB\u7D71\u4FE1\u865F (\u8ACB\u53C3\u95B1\u6587\u4EF6)\n    -Xshare:auto      \u5728\u53EF\u80FD\u7684\u60C5\u6CC1\u4E0B\u4F7F\u7528\u5171\u7528\u985E\u5225\u8CC7\u6599 (\u9810\u8A2D)\n    -Xshare:off       \u4E0D\u5617\u8A66\u4F7F\u7528\u5171\u7528\u985E\u5225\u8CC7\u6599\n    -Xshare:on        \u9700\u8981\u4F7F\u7528\u5171\u7528\u985E\u5225\u8CC7\u6599\uFF0C\u5426\u5247\u6703\u5931\u6557\u3002\n    -XshowSettings    \u986F\u793A\u6240\u6709\u8A2D\u5B9A\u503C\u4E26\u7E7C\u7E8C\u9032\u884C\u4F5C\u696D\n    -XshowSettings:all\n                      \u986F\u793A\u6240\u6709\u8A2D\u5B9A\u503C\u4E26\u7E7C\u7E8C\u9032\u884C\u4F5C\u696D\n    -XshowSettings:locale\n                      \u986F\u793A\u6240\u6709\u5730\u5340\u8A2D\u5B9A\u76F8\u95DC\u8A2D\u5B9A\u503C\u4E26\u7E7C\u7E8C\u9032\u884C\u4F5C\u696D\n    -XshowSettings:properties\n                      \u986F\u793A\u6240\u6709\u5C6C\u6027\u8A2D\u5B9A\u503C\u4E26\u7E7C\u7E8C\u9032\u884C\u4F5C\u696D\n    -XshowSettings:vm \u986F\u793A\u6240\u6709 VM \u76F8\u95DC\u8A2D\u5B9A\u503C\u4E26\u7E7C\u7E8C\u9032\u884C\u4F5C\u696D\n    -Xss<size>        \u8A2D\u5B9A Java \u57F7\u884C\u7DD2\u5806\u758A\u5927\u5C0F\n    -Xverify          \u8A2D\u5B9A Bytecode \u9A57\u8B49\u7A0B\u5F0F\u7684\u6A21\u5F0F\n    --add-reads <module>=<target-module>(,<target-module>)*\n                      \u66F4\u65B0 <module> \u4EE5\u8B80\u53D6 <target-module>\uFF0C\u4E0D\u8AD6\n                      \u6A21\u7D44\u5BA3\u544A\u70BA\u4F55\u3002 \n                      \u53EF\u5C07 <target-module> \u8A2D\u70BA ALL-UNNAMED \u4EE5\u8B80\u53D6\u6240\u6709\u672A\u547D\u540D\u7684\n                      \u6A21\u7D44\u3002\n    --add-exports <module>/<package>=<target-module>(,<target-module>)*\n                      \u66F4\u65B0 <module> \u4EE5\u4FBF\u5C07 <package> \u532F\u51FA\u81F3 <target-module>\uFF0C\n                      \u4E0D\u8AD6\u6A21\u7D44\u5BA3\u544A\u70BA\u4F55\u3002\n                      \u53EF\u5C07 <target-module> \u8A2D\u70BA ALL-UNNAMED \u4EE5\u532F\u51FA\u81F3\u6240\u6709\n                      \u672A\u547D\u540D\u7684\u6A21\u7D44\u3002\n    --add-opens <module>/<package>=<target-module>(,<target-module>)*\n                      \u66F4\u65B0 <module> \u4EE5\u4FBF\u5C07 <package> \u958B\u555F\u81F3\n                      <target-module>\uFF0C\u4E0D\u8AD6\u6A21\u7D44\u5BA3\u544A\u70BA\u4F55\u3002\n    --illegal-access=<value>\n                      \u5141\u8A31\u6216\u62D2\u7D55\u672A\u547D\u540D\u6A21\u7D44\u4E2D\u7684\u7A0B\u5F0F\u78BC\u5C0D\u5DF2\u547D\u540D\u6A21\u7D44\u4E2D\u7684\n                      \u985E\u578B\u6210\u54E1\u9032\u884C\u5B58\u53D6\u3002\n                      <value> \u70BA \"deny\"\u3001\"permit\"\u3001\"warn\" \u6216 \"debug\" \u5176\u4E2D\u4E4B\u4E00\n                      \u6B64\u9078\u9805\u5C07\u5728\u672A\u4F86\u7248\u672C\u4E2D\u79FB\u9664\u3002\n    --limit-modules <module name>[,<module name>...]\n                      \u9650\u5236\u53EF\u76E3\u6E2C\u6A21\u7D44\u7684\u7BC4\u570D\n    --patch-module <module>=<file>({0}<file>)*\n                      \u8986\u5BEB\u6216\u52A0\u5F37\u542B\u6709 JAR \u6A94\u6848\u6216\u76EE\u9304\u4E2D\n                      \u985E\u5225\u548C\u8CC7\u6E90\u7684\u6A21\u7D44\u3002\n    --disable-@files  \u505C\u7528\u9032\u4E00\u6B65\u7684\u5F15\u6578\u6A94\u6848\u64F4\u5145\n\n\u4E0A\u8FF0\u7684\u984D\u5916\u9078\u9805\u82E5\u6709\u8B8A\u66F4\u4E0D\u53E6\u884C\u901A\u77E5\u3002\n" },
            { "java.launcher.cls.error1", "\u932F\u8AA4: \u627E\u4E0D\u5230\u6216\u7121\u6CD5\u8F09\u5165\u4E3B\u8981\u985E\u5225 {0}\n\u539F\u56E0: {1}: {2}" },
            { "java.launcher.cls.error2", "\u932F\u8AA4: \u4E3B\u8981\u65B9\u6CD5\u4E0D\u662F\u985E\u5225 {1} \u4E2D\u7684 {0}\uFF0C\u8ACB\u5B9A\u7FA9\u4E3B\u8981\u65B9\u6CD5\u70BA:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error3", "\u932F\u8AA4: \u4E3B\u8981\u65B9\u6CD5\u5FC5\u9808\u50B3\u56DE\u985E\u5225 {0} \u4E2D void \u985E\u578B\u7684\u503C\uFF0C\n\u8ACB\u5B9A\u7FA9\u4E3B\u8981\u65B9\u6CD5\u70BA:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error4", "\u932F\u8AA4: \u5728\u985E\u5225 {0} \u4E2D\u627E\u4E0D\u5230\u4E3B\u8981\u65B9\u6CD5\uFF0C\u8ACB\u5B9A\u7FA9\u4E3B\u8981\u65B9\u6CD5\u70BA:\n   public static void main(String[] args)\n\u6216\u8005 JavaFX \u61C9\u7528\u7A0B\u5F0F\u985E\u5225\u5FC5\u9808\u64F4\u5145 {1}" },
            { "java.launcher.cls.error5", "\u932F\u8AA4: \u907A\u6F0F\u57F7\u884C\u6B64\u61C9\u7528\u7A0B\u5F0F\u6240\u9700\u7684 JavaFX \u7A0B\u5F0F\u5BE6\u969B\u57F7\u884C\u5143\u4EF6" },
            { "java.launcher.cls.error6", "\u932F\u8AA4: \u8F09\u5165\u4E3B\u8981\u985E\u5225 {0} \u6642\u767C\u751F LinkageError\n\t{1}" },
            { "java.launcher.cls.error7", "\u932F\u8AA4: \u7121\u6CD5\u8D77\u59CB\u4E3B\u8981\u985E\u5225 {0}\n\u539F\u56E0: {1}: {2}" },
            { "java.launcher.init.error", "\u521D\u59CB\u5316\u932F\u8AA4" },
            { "java.launcher.jar.error1", "\u932F\u8AA4: \u5617\u8A66\u958B\u555F\u6A94\u6848 {0} \u6642\u767C\u751F\u672A\u9810\u671F\u7684\u932F\u8AA4" },
            { "java.launcher.jar.error2", "\u5728 {0} \u4E2D\u627E\u4E0D\u5230\u8CC7\u8A0A\u6E05\u55AE" },
            { "java.launcher.jar.error3", "{0} \u4E2D\u6C92\u6709\u4E3B\u8981\u8CC7\u8A0A\u6E05\u55AE\u5C6C\u6027" },
            { "java.launcher.jar.error4", "\u8F09\u5165 {0} \u4E2D\u7684 Java \u4EE3\u7406\u7A0B\u5F0F\u6642\u767C\u751F\u932F\u8AA4" },
            { "java.launcher.javafx.error1", "\u932F\u8AA4: JavaFX launchApplication \u65B9\u6CD5\u7684\u7C3D\u7AE0\u932F\u8AA4\uFF0C\u5B83\n\u5FC5\u9808\u5BA3\u544A\u70BA\u975C\u614B\u4E26\u50B3\u56DE void \u985E\u578B\u7684\u503C" },
            { "java.launcher.module.error1", "\u6A21\u7D44 {0} \u4E0D\u542B MainClass \u5C6C\u6027\uFF0C\u8ACB\u4F7F\u7528 -m <module>/<main-class>" },
            { "java.launcher.module.error2", "\u932F\u8AA4: \u627E\u4E0D\u5230\u6216\u7121\u6CD5\u8F09\u5165\u6A21\u7D44 {1} \u4E2D\u7684\u4E3B\u8981\u985E\u5225 {0}" },
            { "java.launcher.module.error3", "\u932F\u8AA4: \u7121\u6CD5\u8F09\u5165\u6A21\u7D44 {1} \u4E2D\u7684\u4E3B\u8981\u985E\u5225 {0}\n\t{2}" },
            { "java.launcher.module.error4", "\u627E\u4E0D\u5230 {0}" },
            { "java.launcher.module.error5", "\u932F\u8AA4: \u7121\u6CD5\u8D77\u59CB\u6A21\u7D44 {1} \u4E2D\u7684\u4E3B\u8981\u985E\u5225 {0}\n\u539F\u56E0: {1}: {2}" },
            { "java.launcher.opt.footer", "    -cp <\u76EE\u9304\u548C zip/jar \u6A94\u6848\u7684\u985E\u5225\u641C\u5C0B\u8DEF\u5F91>\n    -classpath <\u76EE\u9304\u548C zip/jar \u6A94\u6848\u7684\u985E\u5225\u641C\u5C0B\u8DEF\u5F91>\n    --class-path <\u76EE\u9304\u548C zip/jar \u6A94\u6848\u7684\u985E\u5225\u641C\u5C0B\u8DEF\u5F91>\n                  \u4EE5 {0} \u5340\u9694\u7684\u76EE\u9304\u3001JAR \u5B58\u6A94\n                  \u4EE5\u53CA ZIP \u5B58\u6A94\u6E05\u55AE (\u5C07\u65BC\u5176\u4E2D\u641C\u5C0B\u985E\u5225\u6A94\u6848)\u3002\n    -p <\u6A21\u7D44\u8DEF\u5F91>\n    --module-path <\u6A21\u7D44\u8DEF\u5F91>...\n                  \u4EE5 {0} \u5340\u9694\u7684\u76EE\u9304\u6E05\u55AE\uFF0C\u6BCF\u500B\u76EE\u9304\n                  \u90FD\u662F\u4E00\u500B\u6A21\u7D44\u76EE\u9304\u3002\n    --upgrade-module-path <\u6A21\u7D44\u8DEF\u5F91>...\n                  \u4EE5 {0} \u5340\u9694\u7684\u76EE\u9304\u6E05\u55AE\uFF0C\u6BCF\u500B\u76EE\u9304\n                  \u90FD\u662F\u4E00\u500B\u6A21\u7D44\u76EE\u9304\uFF0C\u7576\u4E2D\u7684\u6A21\u7D44\u53EF\u53D6\u4EE3\u53EF\u5347\u7D1A\n                  \u6A21\u7D44 (\u5728\u7A0B\u5F0F\u5BE6\u969B\u57F7\u884C\u5F71\u50CF\u4E2D)\n    --add-modules <module name>[,<module name>...]\n                  \u9664\u4E86\u8D77\u59CB\u6A21\u7D44\u4E4B\u5916\uFF0C\u8981\u89E3\u6790\u7684\u6839\u6A21\u7D44\u3002\n                  <module name> \u4E5F\u53EF\u4EE5\u662F ALL-DEFAULT\u3001ALL-SYSTEM\u3001\n                  ALL-MODULE-PATH.\n    --list-modules\n                  \u5217\u51FA\u53EF\u76E3\u6E2C\u7684\u6A21\u7D44\u4E26\u7D50\u675F\n    -d <\u6A21\u7D44\u540D\u7A31>\n    --describe-module <\u6A21\u7D44\u540D\u7A31>\n                  \u63CF\u8FF0\u6A21\u7D44\u4E26\u7D50\u675F\n    --dry-run     \u5EFA\u7ACB VM \u4E26\u8F09\u5165\u4E3B\u8981\u985E\u5225\uFF0C\u4F46\u4E0D\u57F7\u884C\u4E3B\u8981\u65B9\u6CD5\u3002\n                  --dry-run \u9078\u9805\u9069\u5408\u7528\u5728\u9A57\u8B49\n                  \u50CF\u6A21\u7D44\u7CFB\u7D71\u7D44\u614B\u7684\u547D\u4EE4\u884C\u9078\u9805\u3002\n    --validate-modules\n                  \u9A57\u8B49\u6240\u6709\u6A21\u7D44\u4E26\u7D50\u675F\n                  --validate-modules \u9078\u9805\u9069\u5408\u7528\u5728\u5C0B\u627E\n                  \u6A21\u7D44\u8DEF\u5F91\u4E0A\u4E4B\u6A21\u7D44\u7684\u885D\u7A81\u548C\u5176\u4ED6\u932F\u8AA4\u3002\n    -D<name>=<value>\n                  \u8A2D\u5B9A\u7CFB\u7D71\u7279\u6027\n    -verbose:[class|module|gc|jni]\n                  \u555F\u7528\u8A73\u7D30\u8CC7\u8A0A\u8F38\u51FA\n    -version      \u5728\u932F\u8AA4\u4E32\u6D41\u5370\u51FA\u7522\u54C1\u7248\u672C\u4E26\u7D50\u675F\n    --version      \u5728\u8F38\u51FA\u4E32\u6D41\u5370\u51FA\u7522\u54C1\u7248\u672C\u4E26\u7D50\u675F\n    -showversion  \u5728\u932F\u8AA4\u4E32\u6D41\u5370\u51FA\u7522\u54C1\u7248\u672C\u4E26\u7E7C\u7E8C\u9032\u884C\u4F5C\u696D\n    --show-version\n                  \u5728\u8F38\u51FA\u4E32\u6D41\u5370\u51FA\u7522\u54C1\u7248\u672C\u4E26\u7E7C\u7E8C\u9032\u884C\u4F5C\u696D\n    --show-module-resolution\n                  \u5728\u555F\u52D5\u6642\u986F\u793A\u6A21\u7D44\u89E3\u6790\u8F38\u51FA\n    -? -h -help\n                  \u5728\u932F\u8AA4\u4E32\u6D41\u5370\u51FA\u6B64\u8AAA\u660E\u8A0A\u606F\n    --help        \u5728\u8F38\u51FA\u4E32\u6D41\u5370\u51FA\u6B64\u8AAA\u660E\u8A0A\u606F\n    -X            \u5728\u932F\u8AA4\u4E32\u6D41\u5370\u51FA\u984D\u5916\u9078\u9805\u7684\u8AAA\u660E\n    --help-extra  \u5728\u8F38\u51FA\u4E32\u6D41\u5370\u51FA\u984D\u5916\u9078\u9805\u7684\u8AAA\u660E\n    -ea[:<packagename>...|:<classname>]\n    -enableassertions[:<packagename>...|:<classname>]\n                  \u555F\u7528\u6307\u5B9A\u4E4B\u8A73\u7D30\u7A0B\u5EA6\u7684\u5BA3\u544A\n    -da[:<packagename>...|:<classname>]\n    -disableassertions[:<packagename>...|:<classname>]\n                  \u505C\u7528\u6307\u5B9A\u4E4B\u8A73\u7D30\u7A0B\u5EA6\u7684\u5BA3\u544A\n    -esa | -enablesystemassertions\n                \u555F\u7528\u7CFB\u7D71\u5BA3\u544A\n    -dsa | -disablesystemassertions\n                  \u505C\u7528\u7CFB\u7D71\u5BA3\u544A\n    -agentlib:<libname>[=<options>]\n                  \u8F09\u5165\u539F\u751F\u4EE3\u7406\u7A0B\u5F0F\u7A0B\u5F0F\u5EAB <libname>\uFF0C\u4F8B\u5982 -agentlib:jdwp\n                  \u53E6\u8ACB\u53C3\u95B1 -agentlib:jdwp=help\n    -agentpath:<pathname>[=<options>]\n                  \u4F9D\u5B8C\u6574\u8DEF\u5F91\u540D\u7A31\u8F09\u5165\u539F\u751F\u4EE3\u7406\u7A0B\u5F0F\u7A0B\u5F0F\u5EAB\n    -javaagent:<jarpath>[=<options>]\n                  \u8F09\u5165 Java \u7A0B\u5F0F\u8A9E\u8A00\u4EE3\u7406\u7A0B\u5F0F\uFF0C\u8ACB\u53C3\u95B1 java.lang.instrument\n    -splash:<imagepath>\n                  \u986F\u793A\u542B\u6307\u5B9A\u5F71\u50CF\u7684\u8EDF\u9AD4\u8CC7\u8A0A\u756B\u9762\n                  \u7CFB\u7D71\u6703\u81EA\u52D5\u652F\u63F4\u4E26\u4F7F\u7528 HiDPI \u7E2E\u653E\u7684\u5F71\u50CF\n                  (\u82E5\u6709\u7684\u8A71)\u3002\u672A\u7E2E\u653E\u5F71\u50CF\u6A94\u6848\u540D\u7A31 (\u4F8B\u5982 image.ext)\n                  \u61C9\u4E00\u5F8B\u4EE5\u5F15\u6578\u7684\u5F62\u5F0F\u50B3\u9001\u7D66 -splash \u9078\u9805\u3002\n                  \u7CFB\u7D71\u5C07\u6703\u81EA\u52D5\u9078\u64C7\u4F7F\u7528\u6700\u9069\u5408\u7684\u7E2E\u653E\u5F71\u50CF\n                  \u3002\n                  \u8ACB\u53C3\u95B1 SplashScreen API \u6587\u4EF6\u77AD\u89E3\u8A73\u7D30\u8CC7\u8A0A\u3002\n    @argument files\n                  \u4E00\u6216\u591A\u500B\u5305\u542B\u9078\u9805\u7684\u5F15\u6578\u6A94\u6848\n    -disable-@files\n                  \u505C\u7528\u9032\u4E00\u6B65\u7684\u5F15\u6578\u6A94\u6848\u64F4\u5145\n\u82E5\u8981\u6307\u5B9A\u9577\u9078\u9805\u7684\u5F15\u6578\uFF0C\u53EF\u4EE5\u4F7F\u7528 --<name>=<value> \u6216\n--<name> <value>\u3002\n" },
            { "java.launcher.opt.header", "\u7528\u6CD5: {0} [options] <mainclass> [args...]\n           (\u7528\u65BC\u57F7\u884C\u985E\u5225)\n   \u6216\u8005  {0} [options] -jar <jarfile> [args...]\n           (\u7528\u65BC\u57F7\u884C jar \u6A94\u6848)\n   \u6216\u8005  {0} [options] -m <module>[/<mainclass>] [args...]\n       {0} [options] --module <module>[/<mainclass>] [args...]\n           (\u7528\u65BC\u57F7\u884C\u6A21\u7D44\u4E2D\u7684\u4E3B\u8981\u985E\u5225)\n\n \u4E3B\u8981\u985E\u5225\u3001-jar <jarfile>\u3001-m \u6216 --module <module>/<mainclass>\n \u4E4B\u5F8C\u7684\u5F15\u6578\u6703\u7576\u6210\u5F15\u6578\u50B3\u9001\u81F3\u4E3B\u8981\u985E\u5225\u3002\n\n \u5176\u4E2D\u9078\u9805\u5305\u62EC:\n\n" },
            { "java.launcher.opt.hotspot", "    {0}\t  \u662F \"{1}\" VM \u7684\u540C\u7FA9\u5B57  [\u5DF2\u4E0D\u518D\u4F7F\u7528]\n" },
            { "java.launcher.opt.vmselect", "    {0}\t  \u9078\u53D6 \"{1}\" VM\n" },
        };
    }
}
