package ca.quickheaven.ocjp.practice.test.one;

import ca.quickheaven.ocjp.practice.test.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Question13 {

    public static void main(String[] args) throws IOException {
        // Given both files "file1.txt" and "file2.txt" already exist. Identify the correct statement about the line of code below:

        Files.move(Paths.get(FileUtils.buildPath("file1.txt")), Paths.get(FileUtils.buildPath("file2.txt")), StandardCopyOption.ATOMIC_MOVE);

        // When the ATOMIC_MOVE is specified, the move is performed as an atomic file system operation and all other
        // options are ignored. Java documentation declares that if the target file exists then it is implementation specific if the existing file is
        // replaced or this method fails by throwing an IOException.
    }
}
