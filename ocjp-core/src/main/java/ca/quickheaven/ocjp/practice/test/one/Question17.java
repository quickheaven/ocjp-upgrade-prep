package ca.quickheaven.ocjp.practice.test.one;

import ca.quickheaven.ocjp.practice.test.FileUtils;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;
import java.util.List;

public class Question17 {

    public static void main(String[] args) throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Files.setLastModifiedTime(Paths.get(FileUtils.buildPath("/test/file.txt")), FileTime.fromMillis(System.currentTimeMillis()));

        Paths.get(FileUtils.buildPath("test")).register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
        WatchKey key = watchService.take();
        List<WatchEvent<?>> list = key.pollEvents();
        System.out.println(list.size());

        // What happens when the above fragment is compiled and run if the "test/file.txt" file exists?
        // It prints nothing.
        // After the specified registers with the watch service, no changes are made to the file in question. As a result,
        // the WatchService.take method will wait forever. The program is hung here and will prints nothing.
        // Notice that we change the lastModifiedTime attribute of file.txt before the file registers with the service, hence it
        // has no effect on the program.
    }
}
