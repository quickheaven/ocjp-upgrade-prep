package ca.quickheaven.ocjp.practice.test.free;

import java.io.IOException;

public class Question14 implements AutoCloseable {

    public static void main(String[] args) {
        // What does the main method print?
        try (Question14 myApp = new Question14()) {
            myApp.open();
            myApp.read();
            myApp.close();
        } catch (IOException e) {
            System.out.println("Exception caught");
        }
        // >> Opening MyApp... I am an exception Closing MyApp... Exception caught
    }

    public void open() {
        System.out.println("Opening MyApp...");
    }

    public void read() throws IOException {
        System.out.println("I am an exception");
        throw new IOException();
    }

    public void close() {
        System.out.println("Closing MyApp...");
    }
}

