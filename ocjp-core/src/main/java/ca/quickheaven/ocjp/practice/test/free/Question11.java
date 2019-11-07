package ca.quickheaven.ocjp.practice.test.free;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Question11 {

    public static void main(String[] args) throws IOException {
        // Which of the given options are valid when being inserted at // insert here? Given the file named "file.txt" exists.
        // insert here
        OpenOption[] options = new OpenOption[]{StandardOpenOption.APPEND, StandardOpenOption.WRITE};
        // or
        OpenOption[] options1 = new OpenOption[]{StandardOpenOption.APPEND, StandardOpenOption.SYNC};

        Files.write(Paths.get("file.txt"), "abc".getBytes(), options);

        // We open the file for writing, thus READ options is invalid.
        // PREFEND option does not exists.
        // Options APPPEND and TRUNCATE_EXISTING cannot go together.
    }
}
