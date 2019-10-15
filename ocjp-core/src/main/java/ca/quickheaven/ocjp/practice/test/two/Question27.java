package ca.quickheaven.ocjp.practice.test.two;

public class Question27 {

    /*
     * Assume we have four files in a directory:
     * photo.jpeg, jquery.js, index.html and config.xml
     * Which file are captured by the following PathMatcher pattern?
     * glob:?[!j]*
     *
     * >> None of those files.
     * In a glob pattern, "?" represents once and only one character. As such, the given pattern captures only files
     * with name starting with a single character, followed by a dot (.) and the extension does not start with a "j". In the
     * provided directory,no files bases names containing only one character. Consequently, the pattern does not
     * match any file.
     */
}
