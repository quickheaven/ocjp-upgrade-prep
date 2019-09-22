package ca.quickheaven.ocjp.practice.test.one;

import java.io.IOException;

public class Question47 implements AutoCloseable {

    public static void main(String[] args) {
        try (Question47 resource = new Question47()) { // Compilation fails because AutoCloseable was not* implemented
            resource.open();
            resource.read();
            resource.close();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }

    public void open() {
        System.out.println("Resource opened");
    }

    public void read() throws IOException {
        throw new IOException();
    }

    public void close() {
        System.out.println("Resource closed");
    }
}
