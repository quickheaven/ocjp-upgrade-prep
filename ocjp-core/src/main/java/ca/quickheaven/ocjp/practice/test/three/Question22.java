package ca.quickheaven.ocjp.practice.test.three;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question22 {

    public static void main(String[] args) {
        Path source = Paths.get("file1.txt");
        // Files.copy(source, "/* insert here */");

        /*
         * Assume that both file1.txt and file2.txt exist in the current working directory. Which of the following expressions
         * allows the contents of file1.txt to be copied to file2.txt when placed at 'insert here' ?
         *
         * source.resolve("file2.txt)
         *
         * source.resolveSibling("file2.txt)
         *
         * source.relativize("file2.txt)
         *
         * None of the above
         *
         */

    }
}
