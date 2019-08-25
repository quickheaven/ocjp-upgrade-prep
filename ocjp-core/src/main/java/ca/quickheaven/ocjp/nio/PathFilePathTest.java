package ca.quickheaven.ocjp.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFilePathTest {

    public static void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println("Root is: " + path.getRoot());

        Path currentPath = path;
        while ((currentPath = currentPath.getParent()) != null) {
            System.out.println("Current parent is: " + currentPath);
        }
    }

    public static void main(String[] args) {
        printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
        /*
        Filename is: shells.txt
        Root is: /
        Current parent is: /zoo/armadillo
        Current parent is: /zoo
        Current parent is: /
         */
        System.out.println();
        printPathInformation(Paths.get("armadillo/shells.txt"));
        /*
        Filename is: shells.txt
        Root is: null
        Current parent is: armadillo
         */
    }
}
