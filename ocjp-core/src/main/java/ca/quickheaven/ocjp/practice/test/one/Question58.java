package ca.quickheaven.ocjp.practice.test.one;

import java.nio.file.Paths;

public class Question58 {

    public static void main(String[] args) {
        // What happens when the following statement is compiled and run on a nix system?
        System.out.println(Paths.get("/", "/", "file.txt"));

        // It prints out "/file.txt"
        // The slash character (/) is the file separator on a nix system, hence it is ignored no matter how many times it
        // appears between path elements.
    }
}
