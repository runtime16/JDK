package sun.tools.jar.resources;

import java.util.ListResourceBundle;

public final class jar extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "error.bad.cflag", "'c' flag requires manifest or input files to be specified!" },
            { "error.bad.dflag", "'-d, --describe-module' option requires no input file(s) to be specified" },
            { "error.bad.eflag", "'e' flag and manifest with the 'Main-Class' attribute cannot be specified \ntogether!" },
            { "error.bad.file.arg", "Error parsing file arguments" },
            { "error.bad.option", "One of options -{ctxuid} must be specified." },
            { "error.bad.reason", "bad reason: {0}, must be one of deprecated, deprecated-for-removal, or incubating" },
            { "error.bad.uflag", "'u' flag requires manifest, 'e' flag or input files to be specified!" },
            { "error.cant.open", "can''t open: {0}" },
            { "error.create.dir", "{0} : could not create directory" },
            { "error.create.tempfile", "Could not create a temporary file" },
            { "error.hash.dep", "Hashing module {0} dependences, unable to find module {1} on module path" },
            { "error.illegal.option", "Illegal option: {0}" },
            { "error.incorrect.length", "incorrect length while processing: {0}" },
            { "error.invalid.versioned.module.attribute", "Invalid module descriptor attribute {0}" },
            { "error.missing.arg", "option {0} requires an argument" },
            { "error.missing.provider", "Service provider not found: {0}" },
            { "error.module.descriptor.not.found", "Module descriptor not found" },
            { "error.module.options.without.info", "One of --module-version or --hash-modules without module-info.class" },
            { "error.multiple.main.operations", "You may not specify more than one '-cuxtid' options" },
            { "error.no.operative.descriptor", "No operative descriptor for release: {0}" },
            { "error.no.root.descriptor", "No root module descriptor, specify --release" },
            { "error.nosuch.fileordir", "{0} : no such file or directory" },
            { "error.release.unexpected.versioned.entry", "unexpected versioned entry {0} for release {1}" },
            { "error.release.value.notnumber", "release {0} not valid" },
            { "error.release.value.toosmall", "release {0} not valid, must be >= 9" },
            { "error.unable.derive.automodule", "Unable to derive module descriptor for: {0}" },
            { "error.unexpected.module-info", "Unexpected module descriptor {0}" },
            { "error.unrecognized.option", "unrecognized option : {0}" },
            { "error.validator.bad.entry.name", "entry name malformed, {0}" },
            { "error.validator.different.api", "entry: {0}, contains a class with different api from earlier version" },
            { "error.validator.entryname.tooshort", "entry name: {0}, too short, not a directory" },
            { "error.validator.incompatible.class.version", "entry: {0}, has a class version incompatible with an earlier version" },
            { "error.validator.info.exports.notequal", "module-info.class in a versioned directory contains different \"exports\"" },
            { "error.validator.info.manclass.notequal", "{0}: module-info.class in a versioned directory contains different \"main-class\"" },
            { "error.validator.info.name.notequal", "module-info.class in a versioned directory contains incorrect name" },
            { "error.validator.info.opens.notequal", "module-info.class in a versioned directory contains different \"opens\"" },
            { "error.validator.info.provides.notequal", "module-info.class in a versioned directory contains different \"provides\"" },
            { "error.validator.info.requires.added", "module-info.class in a versioned directory contains additional \"requires\"" },
            { "error.validator.info.requires.dropped", "module-info.class in a versioned directory contains missing \"requires\"" },
            { "error.validator.info.requires.transitive", "module-info.class in a versioned directory contains additional \"requires transitive\"" },
            { "error.validator.info.version.notequal", "{0}: module-info.class in a versioned directory contains different \"version\"" },
            { "error.validator.isolated.nested.class", "entry: {0}, is an isolated nested class" },
            { "error.validator.jarfile.exception", "can not validate {0}: {1}" },
            { "error.validator.jarfile.invalid", "invalid multi-release jar file {0} deleted" },
            { "error.validator.names.mismatch", "entry: {0}, contains a class with internal name {1}, names do not match" },
            { "error.validator.new.public.class", "entry: {0}, contains a new public class not found in base entries" },
            { "error.validator.version.notnumber", "entry name: {0}, does not have a version number" },
            { "error.write.file", "Error in writing existing jar file" },
            { "main.help.opt.any", " Operation modifiers valid in any mode:\n\n  -C DIR                     Change to the specified directory and include the\n                             following file" },
            { "main.help.opt.any.file", "  -f, --file=FILE            The archive file name. When omitted, either stdin or\n                             stdout is used based on the operation\n      --release VERSION      Places all following files in a versioned directory\n                             of the jar (i.e. META-INF/versions/VERSION/)" },
            { "main.help.opt.any.verbose", "  -v, --verbose              Generate verbose output on standard output" },
            { "main.help.opt.create", " Operation modifiers valid only in create mode:\n" },
            { "main.help.opt.create.normalize", "  -n, --normalize            Normalize information in the new jar archive\n                             after creation" },
            { "main.help.opt.create.update", " Operation modifiers valid only in create and update mode:\n" },
            { "main.help.opt.create.update.do-not-resolve-by-default", "      --do-not-resolve-by-default  Exclude from the default root set of modules" },
            { "main.help.opt.create.update.hash-modules", "      --hash-modules=PATTERN Compute and record the hashes of modules \n                             matched by the given pattern and that depend upon\n                             directly or indirectly on a modular jar being\n                             created or a non-modular jar being updated" },
            { "main.help.opt.create.update.index", " Operation modifiers valid only in create, update, and generate-index mode:\n" },
            { "main.help.opt.create.update.index.no-compress", "  -0, --no-compress          Store only; use no ZIP compression" },
            { "main.help.opt.create.update.main-class", "  -e, --main-class=CLASSNAME The application entry point for stand-alone\n                             applications bundled into a modular, or executable,\n                             jar archive" },
            { "main.help.opt.create.update.manifest", "  -m, --manifest=FILE        Include the manifest information from the given\n                             manifest file" },
            { "main.help.opt.create.update.module-path", "  -p, --module-path          Location of module dependence for generating\n                             the hash" },
            { "main.help.opt.create.update.module-version", "      --module-version=VERSION    The module version, when creating a modular\n                             jar, or updating a non-modular jar" },
            { "main.help.opt.create.update.no-manifest", "  -M, --no-manifest          Do not create a manifest file for the entries" },
            { "main.help.opt.create.update.warn-if-resolved", "      --warn-if-resolved     Hint for a tool to issue a warning if the module\n                             is resolved. One of deprecated, deprecated-for-removal,\n                             or incubating" },
            { "main.help.opt.main", " Main operation mode:\n" },
            { "main.help.opt.main.create", "  -c, --create               Create the archive" },
            { "main.help.opt.main.describe-module", "  -d, --describe-module      Print the module descriptor, or automatic module name" },
            { "main.help.opt.main.extract", "  -x, --extract              Extract named (or all) files from the archive" },
            { "main.help.opt.main.generate-index", "  -i, --generate-index=FILE  Generate index information for the specified jar\n                             archives" },
            { "main.help.opt.main.list", "  -t, --list                 List the table of contents for the archive" },
            { "main.help.opt.main.update", "  -u, --update               Update an existing jar archive" },
            { "main.help.opt.other", " Other options:\n" },
            { "main.help.opt.other.help", "  -h, --help[:compat]        Give this, or optionally the compatibility, help" },
            { "main.help.opt.other.help-extra", "      --help-extra           Give help on extra options" },
            { "main.help.opt.other.version", "      --version              Print program version" },
            { "main.help.postopt", " An archive is a modular jar if a module descriptor, 'module-info.class', is\n located in the root of the given directories, or the root of the jar archive\n itself. The following operations are only valid when creating a modular jar,\n or updating an existing non-modular jar: '--module-version',\n '--hash-modules', and '--module-path'.\n\n Mandatory or optional arguments to long options are also mandatory or optional\n for any corresponding short options." },
            { "main.help.preopt", "Usage: jar [OPTION...] [ [--release VERSION] [-C dir] files] ...\njar creates an archive for classes and resources, and can manipulate or\nrestore individual classes or resources from an archive.\n\n Examples:\n # Create an archive called classes.jar with two class files:\n jar --create --file classes.jar Foo.class Bar.class\n # Create an archive using an existing manifest, with all the files in foo/:\n jar --create --file classes.jar --manifest mymanifest -C foo/ .\n # Create a modular jar archive, where the module descriptor is located in\n # classes/module-info.class:\n jar --create --file foo.jar --main-class com.foo.Main --module-version 1.0\n     -C foo/ classes resources\n # Update an existing non-modular jar to a modular jar:\n jar --update --file foo.jar --main-class com.foo.Main --module-version 1.0\n     -C foo/ module-info.class\n # Create a multi-release jar, placing some files in the META-INF/versions/9 directory:\n jar --create --file mr.jar -C foo classes --release 9 -C foo9 classes\n\nTo shorten or simplify the jar command, you can specify arguments in a separate\ntext file and pass it to the jar command with the at sign (@) as a prefix.\n\n Examples:\n # Read additional options and list of class files from the file classes.list\n jar --create --file my.jar @classes.list\n" },
            { "main.usage.summary", "Usage: jar [OPTION...] [ [--release VERSION] [-C dir] files] ..." },
            { "main.usage.summary.try", "Try `jar --help' for more information." },
            { "out.added.manifest", "added manifest" },
            { "out.added.module-info", "added module-info: {0}" },
            { "out.adding", "adding: {0}" },
            { "out.automodule", "No module descriptor found. Derived automatic module." },
            { "out.create", "  created: {0}" },
            { "out.deflated", "(deflated {0}%)" },
            { "out.extracted", "extracted: {0}" },
            { "out.ignore.entry", "ignoring entry {0}" },
            { "out.inflated", " inflated: {0}" },
            { "out.size", "(in = {0}) (out= {1})" },
            { "out.stored", "(stored 0%)" },
            { "out.update.manifest", "updated manifest" },
            { "out.update.module-info", "updated module-info: {0}" },
            { "usage.compat", "Compatibility Interface:\nUsage: jar {ctxui}[vfmn0PMe] [jar-file] [manifest-file] [entry-point] [-C dir] files] ...\nOptions:\n    -c  create new archive\n    -t  list table of contents for archive\n    -x  extract named (or all) files from archive\n    -u  update existing archive\n    -v  generate verbose output on standard output\n    -f  specify archive file name\n    -m  include manifest information from specified manifest file\n    -n  perform Pack200 normalization after creating a new archive\n    -e  specify application entry point for stand-alone application \n        bundled into an executable jar file\n    -0  store only; use no ZIP compression\n    -P  preserve leading '/' (absolute path) and \"..\" (parent directory) components from file names\n    -M  do not create a manifest file for the entries\n    -i  generate index information for the specified jar files\n    -C  change to the specified directory and include the following file\nIf any file is a directory then it is processed recursively.\nThe manifest file name, the archive file name and the entry point name are\nspecified in the same order as the 'm', 'f' and 'e' flags.\n\nExample 1: to archive two class files into an archive called classes.jar: \n       jar cvf classes.jar Foo.class Bar.class \nExample 2: use an existing manifest file 'mymanifest' and archive all the\n           files in the foo/ directory into 'classes.jar': \n       jar cvfm classes.jar mymanifest -C foo/ .\n" },
            { "warn.release.unexpected.versioned.entry", "unexpected versioned entry {0}" },
            { "warn.validator.concealed.public.class", "Warning: entry {0} is a public class\nin a concealed package, placing this jar on the class path will result\nin incompatible public interfaces" },
            { "warn.validator.identical.entry", "Warning: entry {0} contains a class that\nis identical to an entry already in the jar" },
            { "warn.validator.resources.with.same.name", "Warning: entry {0}, multiple resources with same name" },
        };
    }
}
