package ca.quickheaven.ocjp.practice.test.two;

import java.io.IOException;

public class Question52 {

    public static void main(String[] args) {
        // Which exception type will be caught and handled by the catch block after the following code fragment is compiled and run?
        try (CustomResource resource = new CustomResource()) {
            throw new SecurityException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // >> SecurityException
        // When dealing with a try-with-resource statement, if exceptions are thrown from the try block as well as when
        // closing resources, the latter will be suppressed.
    }
}

class CustomResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new IOException();
    }
}