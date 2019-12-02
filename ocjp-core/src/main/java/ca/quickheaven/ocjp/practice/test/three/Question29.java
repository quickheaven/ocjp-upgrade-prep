package ca.quickheaven.ocjp.practice.test.three;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question29 {

    public static void main(String[] args) {
        Path path1 = Paths.get("//users/./project/../../scr/main/resources/config.xml");
        Path path2 = path1.relativize(path1.normalize());
        System.out.println(path1.getNameCount() + " " + path2.getNameCount());
    }
}
