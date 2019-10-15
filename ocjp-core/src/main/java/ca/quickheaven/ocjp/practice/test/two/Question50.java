package ca.quickheaven.ocjp.practice.test.two;

import java.io.IOException;
import java.nio.file.*;

public class Question50 {

    public static void main(String[] args) {
        Path path1 = Paths.get("file1.txt");
        Path path2 = Paths.get("file2.txt");

        try {
            Files.move(path1, path2, StandardCopyOption.ATOMIC_MOVE);
        } catch (
                /*
                  FileAlreadyExistsException
                | AtomicMoveNotSupportedException
                | DirectoryNotEmptyException
                | UnsupportedOperationException
                | SecurityException | */
                IOException // added to fix the compilation
                        e) {
            e.printStackTrace();
        }
        // What happens when the above fragment is compiled and executed?
        // >> It fails to be compiled as the catch clause does not cover enough exception types.

    }
}
