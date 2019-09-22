package ca.quickheaven.ocjp.practice.test.one;

import ca.quickheaven.ocjp.practice.test.FileUtils;

import java.io.IOException;
import java.nio.channels.AsynchronousByteChannel;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Question46 {

    public static void main(String[] args) {
        Path path = Paths.get(FileUtils.buildPath("file.txt"));
        AsynchronousFileChannel fileChannel;
        try {
            fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);
            //
        }
        // insert code here
        // Which of the following options should be placed at // insert code here to make the above code compiled?

        catch (IOException e) {
            e = (IOException) new Exception(e);
            e.printStackTrace();
        }

        // Note: When a catch block handles more than one exception type, the catch parameter is implicitly final.
        // inheritance related Exception types are not allowed to be declared within the same catch block.
    }
}
