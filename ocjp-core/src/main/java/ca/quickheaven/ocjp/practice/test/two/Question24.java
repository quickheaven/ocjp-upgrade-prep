package ca.quickheaven.ocjp.practice.test.two;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question24 {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\src\\test\\java\\MyTest.java");
        // What happens when the following statement is compiled and run on a Windows system?

        /**
         * path.getRoot() returns "C:\"
         * path.getName(0) returns "src"
         * path.getName(1) returns "test"
         * path.getName(2) returns "java"
         * path.getName(3) returns "MyTest.java"
         * path.getName(4) throws IllegalArgumentException
         */

    }
}
