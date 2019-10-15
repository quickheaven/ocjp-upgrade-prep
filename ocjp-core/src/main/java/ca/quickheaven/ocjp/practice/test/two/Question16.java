package ca.quickheaven.ocjp.practice.test.two;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question16 {

    public static void main(String[] args) {

        Path path = Paths.get("/users/java/package/MyClass.java");
        System.out.println(path.startsWith("users") + " " + path.endsWith("MyClass"));

        // What happens when the above fragment is executed?
        // It prints out "false false"

        // The Path in question starts with /users and ends with MyClass.java.

    }
}
