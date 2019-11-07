package ca.quickheaven.ocjp.practice.test.free;

import java.io.IOException;

public class Question2 {

    public static void main(String[] args) {
        // What does the fragment print when the main method runs?
        // resource
        // exception
        // java.io.IOException
        try (MyResource resource = new MyResource()) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("exception");
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println(throwable.getClass().getName());
            }
        }
    }
}

class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("resource");
        throw new IOException();
    }
}