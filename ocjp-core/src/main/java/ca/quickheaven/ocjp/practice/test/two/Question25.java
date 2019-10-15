package ca.quickheaven.ocjp.practice.test.two;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question25 {

    public static void main(String[] args) {
        Path path1 = Paths.get("./../file1");
        Path path2 = Paths.get("file2");
        Path path3 = path1.relativize(path2);
        System.out.println(path3); // ../../../file2

        // The Path interface just counts the number of file separators to decide the level of directory hierarchy, regardless of a
        // directory in the path being the current one (.) or its parent (..). In the given scenario, file1 is placed after three file
        // separator, thus we must go back three levels to reach the root
    }
}
