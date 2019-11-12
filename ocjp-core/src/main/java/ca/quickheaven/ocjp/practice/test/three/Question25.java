package ca.quickheaven.ocjp.practice.test.three;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Question25 {

    public static void main(String[] args) throws IOException {
        Files.find(Paths.get(""), Integer.MAX_VALUE, (p, a) -> p.endsWith(".txt"))
                .map(p -> p.toAbsolutePath()).forEach(System.out::println);

        // What happens when the above statement is compiled and run?
        // >> It prints out the absolute path of all files named ".txt" in the current working directory and its sub-directories.
    }
}
