package ca.quickheaven.ocjp.practice.test.two;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question22 {

    public static void main(String[] args) {
        Path path1 = Paths.get("/users/projects");
        Path path2 = Paths.get("index.html");
        System.out.println(path1.relativize(path2));

        // What happens when the provided code is compiled and executed on a *nix system?
        // >> It throws an IllegalArgumentException

        // The Path.relativize contructs a relative path between this path and a given path. Notice that a relative path
        // cannot be constructed if only one of the paths have a root component. When this happens, an IllegalArgumentException is thrown.
    }
}
