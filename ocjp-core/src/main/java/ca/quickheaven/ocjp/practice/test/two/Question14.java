package ca.quickheaven.ocjp.practice.test.two;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Question14 {

    public static void main(String[] args) throws IOException {

        // What does the the following code fragment print?
        MyFileVisitor fileVisitor = new MyFileVisitor();
        Files.walkFileTree(Paths.get("/users"), fileVisitor);
        System.out.println(fileVisitor.count);

        // The amount of all files (not including directories) within /users directory and sub-directories.
        // In the MyFileVisitor class, we instruct the file walking to skip sub-trees when the name of a directory does not start
        // with "user". However, we put the code in method postVisitDirectory, meaning that the instruction is implemented
        // after all sub-trees have been visited. As a result, it has completely no effect on the program.

    }
}

class MyFileVisitor implements FileVisitor<Path> {

    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/user");
    int count = 0;

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        if (matcher.matches(dir)) {
            return FileVisitResult.CONTINUE;
        } else {
            return FileVisitResult.SKIP_SUBTREE;
        }
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        count++;
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        return FileVisitResult.CONTINUE;
    }


}