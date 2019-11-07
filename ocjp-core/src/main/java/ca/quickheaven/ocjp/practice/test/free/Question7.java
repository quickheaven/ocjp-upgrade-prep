package ca.quickheaven.ocjp.practice.test.free;

import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;

public class Question7 {

    public static void main(String[] args) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**.{xml, json}");

        // PathMatcher is an interface, so it is impossible to instantiate an object of this type through constructor.
        // Te given String pattern is a glob syntax, not regex. It will throw a runtime exception of type PatternSyntaxException when running.
    }
}
