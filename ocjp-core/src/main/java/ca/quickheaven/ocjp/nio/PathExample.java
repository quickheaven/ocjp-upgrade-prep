package ca.quickheaven.ocjp.nio;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

    public static void main(String[] args) {

        //creatingPaths();

        interactingWithPathsAndFiles();

    }

    private static void creatingPaths() {

        // The first example creates a Path reference to a relative file in the current working directory.
        // The second example creates a Path reference to an absolute file in a Windows-based system.
        // The third example creates a Path reference to an absolute directory in a Linux or Mac-based system.

        Path patha1 = Paths.get("pandas/cuddly.png");

        Path patha2 = Paths.get("c:\\zooinfo\\November\\employees.txt");

        Path patha3 = Paths.get("/home/zoodirector");

        // You can also creates a Path using the Paths class using a varargs of type String, such as Paths.get(String, String...).
        // This allows you to create a Path from a list of String values in which the operating system-dependent path.separator
        // is automatically instead between elements.

        Path pathb1 = Paths.get("pandas", "cuddly.png");

        Path pathb2 = Paths.get("c:", "zooinfo", "November", "employee.txt");

        Path pathb3 = Paths.get("/", "home", "zoodirector");

        // Another way to construct a Path using the Paths class is with a URI value. A uniform resource identifier (URI)
        // is a string of characters that identify a resource. It begins with a schema that indicates the resource type,
        // followed by a path value. Examples of schema value include file://, http://, and ftp://. The java.net URI
        // class is used to create and manage URI values.

        try {
            Path pathc1 = Paths.get(new URI("file://pandas.cuddly.png")); // THROWS EXCEPTION AT RUNTIME, as URIs must reference a absolute paths at runtime.

            Path pathc2 = Paths.get(new URI("file:///c:/zoo-info/November/employess.txt"));

            Path pathc3 = Paths.get(new URI("file://home/zoodirectory"));

            // We now present two additional methods that use other types of non-local file system schemas.

            Path pathc4 = Paths.get(new URI("http://www.wiley.com"));

            Path pathc5 = Paths.get(new URI("ftp://username:password@ftp.the-ftp-server.com"));

            // Finally, the Path interface also contains a reciprocal method toUri() for converting a Path instance back
            // to a URI instance
            URI uric4 = pathc4.toUri();

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        // Accessing the Underlying FileSystem Object
        // The Path.getPath() method used throughout the previous examples is actually short-hand for the class java.nio.file.FileSystems
        // method getPath(). The FileSystems class has  protected constructor, so we use the plural FileSystems factory
        // class to obtain an instance of FileSystem, as show in the following example code.
        Path pathd1 = FileSystems.getDefault().getPath("pandas/cuddly.png");

        Path pathd2 = FileSystems.getDefault().getPath("c:", "zooinfo", "November", "employee.txt");

        Path pathd3 = FileSystems.getDefault().getPath("/home/zoodirector");

        // The FileSystems factory class does give us the ability to connect to a remote file system, as shown in the
        // following sample code:
        try {
            FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));
            Path path = fileSystem.getPath("duck.txt");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        // Working with Legacy File Instances
        // When Path was added in Java 7, the legacy java.io.File class was updated with a new method, toPath(), that
        // operates on an instance File variable.
        File file = new File("pandas/cuddly.png");
        Path path = file.toPath();

        // For backward compatibility, the Path interface also contains a method toFile() to a return File instance:
        Path pathCompatibility = Paths.get("cuddly.png");
        File fileFromPath = path.toFile();

    }

    public static void interactingWithPathsAndFiles() {

        // Accessing Path components with getFileName(), getParent(), and getRoot()
        // @see PathFilePathTest

        // Checking Path Type with isAbsolute() and toAbsolutePath()
        Path path2 = Paths.get("birds/condor.txt");
        System.out.println("Path2 is Absolute? " + path2.isAbsolute()); // Path2 is Absolute? false
        System.out.println("Absolute Path2 " + path2.toAbsolutePath()); // /home/frozencloud/x-20a/repos/ocjp-upgrade-prep/birds/condor.txt
    }
}
