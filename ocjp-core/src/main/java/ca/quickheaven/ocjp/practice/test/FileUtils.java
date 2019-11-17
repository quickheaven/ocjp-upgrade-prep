package ca.quickheaven.ocjp.practice.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public static String buildPath(String fileName) {
        Path currentDir = Paths.get(""); // \~\~~\ocjp-upgrade-prep\ocjp-core

        return String.format("%s/src/main/resources/%s", currentDir.toAbsolutePath(), fileName);
    }

    public static void main(String[] args) {

    }
}
