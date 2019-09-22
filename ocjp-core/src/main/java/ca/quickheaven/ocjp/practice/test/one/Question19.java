package ca.quickheaven.ocjp.practice.test.one;

import ca.quickheaven.ocjp.practice.test.FileUtils;

import java.io.IOException;
import java.nio.file.*;

public class Question19 {

    public static void main(String[] args) throws IOException, InterruptedException {

        WatchService watchService = FileSystems.getDefault().newWatchService();
        Paths.get(FileUtils.buildPath("test")).register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE);
        while (true) {
            WatchKey key = watchService.take();
            for (WatchEvent<?> watchEvent : key.pollEvents()) {
                WatchEvent.Kind<?> kind = watchEvent.kind();
                System.out.println(watchEvent.context() + " : " + kind.name());
                // key.reset(); // uncomment this in order to ENTRY_DELETE to be called.
            }
        }
        // What happens when the above code is compiled and run, and a file named "file" inside the "test"
        // subdirectory is then created and deleted afterwards?
        // It prints out: "file: ENTRY_CREATE"

    }

}
