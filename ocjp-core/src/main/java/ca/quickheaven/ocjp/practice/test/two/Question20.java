package ca.quickheaven.ocjp.practice.test.two;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question20 {

    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/MyClass.java");
        System.out.println(path.getName(4));

        // What happens when the above code is compiled and executed?
        // >> It throws an IllegalArgumentException
    }
}
