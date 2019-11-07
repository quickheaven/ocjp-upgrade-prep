package ca.quickheaven.ocjp.practice.test.free;

import java.io.IOException;

class MyApp implements AutoCloseable {

    private int id;

    public MyApp(int id) {
        this.id = id;
        if (id > 1) {
            throw new RuntimeException();
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing app" + id);
        throw new IOException();
    }
}

public class Question3 {

    public static void main(String[] args) throws Exception {
        // identify the result
        try (MyApp app1 = new MyApp(1); MyApp app2 = new MyApp(2)) {
            System.out.println("My app");
        }
        // It prints "Closing app1", then throws a RuntimeException exception.

    }
}


