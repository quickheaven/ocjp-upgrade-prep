package ca.quickheaven.ocjp.practice.test.two;

import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;

public class Question13 {

    public static void main(String[] args) {
        /*
         * rootDir
         * ---- java
         * -------- MyClass.java
         * ---- resources
         * -------- logback.xml
         * -------- index.html
         *
         * Which of the following PathMatcher objects matches all these files given rootDir is the current working directory?
         */


        PathMatcher correct = FileSystems.getDefault().getPathMatcher("glob:**{java, *ml}");

        // A couple of square brackets [] are used to specify multiple options for a single character. As such, the pattern below matches the files ending with ".j", ".a" etc.
        PathMatcher b = FileSystems.getDefault().getPathMatcher("glob:**.[java,html,xml]");

        // As per Java documentation, the * character matches zero or more characters of a name element without crossing directory bounderies.
        // The pattern below match files within the current directory or rootDir
        PathMatcher c = FileSystems.getDefault().getPathMatcher("glob:*.[java,html,xml]");
        PathMatcher d = FileSystems.getDefault().getPathMatcher("glob:*.*");


    }
}
