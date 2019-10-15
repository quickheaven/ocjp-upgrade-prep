package ca.quickheaven.ocjp.practice.test.two;

import ca.quickheaven.ocjp.practice.test.FileUtils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question18 {

    public static void main(String[] args) {
        Path path1 = Paths.get(FileUtils.buildPath("test") + "/file.txt");

        System.out.println(path1.resolveSibling("text.txt"));
        System.out.println(path1.resolveSibling(Paths.get("text.txt")));
        //System.out.println(path1.toAbsolutePath().get("text.txt");
        //System.out.println(Paths.get(path1.toAbsolutePath(), "text.txt");
    }
}
