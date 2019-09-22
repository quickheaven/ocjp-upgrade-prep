package ca.quickheaven.ocjp.practice.test.one;

import ca.quickheaven.ocjp.practice.test.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class Question11 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(FileUtils.buildPath("file.txt")); // Paths.get("file/txt");
        // Which of the following statements should be used to change the last modified time of a file?
        Files.setAttribute(path, "lastModifiedTime", FileTime.fromMillis(System.currentTimeMillis()));
    }
}
