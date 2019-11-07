package ca.quickheaven.ocjp.practice.test.free;

import ca.quickheaven.ocjp.practice.test.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Question1 {

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get(FileUtils.buildPath("file1.txt"));
        Path p2 = Paths.get(FileUtils.buildPath("file2.txt"));

        Files.copy(p1, p2, StandardCopyOption.COPY_ATTRIBUTES); // An exception is thrown in runtime (FileAlreadyExistsException)

        // When the target file is already existent, it is required that the REPLACE_EXISTING option is passed to the copy method.
    }
}
