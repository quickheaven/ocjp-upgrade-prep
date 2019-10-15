package ca.quickheaven.ocjp.practice.test.two;

import ca.quickheaven.ocjp.practice.test.FileUtils;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;

public class Question15 {

    public static void main(String[] args) throws IOException, InterruptedException {
        Path path = Paths.get(FileUtils.buildPath("test"));
        WatchService watchService = FileSystems.getDefault().newWatchService();
        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);

        Files.setLastModifiedTime(Paths.get(FileUtils.buildPath("test"), "file.txt"), FileTime.fromMillis(System.currentTimeMillis()));

        WatchKey key = watchService.take();
        key.reset();
        System.out.print(key.isValid());
        key.cancel();
        System.out.print(key.isValid());
        key.reset();
        System.out.print(key.isValid());

        // What happens when the above fragment is compiled and run if the "test/file.txt" file exits?
        // It prints out "truefalsefalse"
        // As per the Java documentation, if a watch key has been cancelled or is already in the ready state then invoking its
        // reset method has no effect.
    }
}
