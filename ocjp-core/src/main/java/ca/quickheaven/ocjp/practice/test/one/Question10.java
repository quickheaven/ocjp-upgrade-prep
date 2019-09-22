package ca.quickheaven.ocjp.practice.test.one;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question10 {

    public static void main(String[] args) {
        Path path = Paths.get("D://parent-dir/main-dir/child-dir");
        System.out.println(path.getName(2)); // child-dir
    }
}
