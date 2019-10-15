package ca.quickheaven.ocjp.practice.test.two;

import ca.quickheaven.ocjp.practice.test.FileUtils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question26 {

    public static void main(String[] args) {
        Path path1 = Paths.get(FileUtils.buildPath("/users/alex"));
        Path path2 = path1.resolve(FileUtils.buildPath("project/src")); // 1
        path1.resolve(path2); // 2
        path2.resolve("1z0813");
        System.out.println(path1);
        System.out.println(path2);

        // It prints out "/users/alex" and "/users/alex/project/src". {run in linux mint}
    }
}
