package ca.quickheaven.ocjp.practice.test.three;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question19 {

    public static void main(String[] args) {
        Path path = Paths.get("./my-dir/..");
        System.out.println(path.normalize());
        // What happens when the above code is compiled and executed?
        // >> It never prints anything
        // If a ".." is preceded by a non-".." name then both names are both considered redundant.
    }
}
