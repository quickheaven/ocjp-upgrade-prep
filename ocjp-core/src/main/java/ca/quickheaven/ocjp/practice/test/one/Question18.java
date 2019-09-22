package ca.quickheaven.ocjp.practice.test.one;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question18 {

    public static void main(String[] args) {
        Path path1 = Paths.get("a");
        Path path2 = Paths.get("b");

        System.out.println(path1.resolve(path2));       // "a\b"
        System.out.println(path1.relativize(path2));    // "../b"
    }

}
