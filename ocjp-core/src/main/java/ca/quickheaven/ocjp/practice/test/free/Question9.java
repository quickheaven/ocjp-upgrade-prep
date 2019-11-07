package ca.quickheaven.ocjp.practice.test.free;

import java.util.concurrent.*;

public class Question9 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // What is the result?
        // It prints "Hello world!"
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Future<String> asyncResult = threadPool.submit(new Callable<String>() {
            @Override
            public String call() throws InterruptedException {
                Thread.sleep(1000);
                return "Hello world";
            }
        });
        while (!asyncResult.isDone()) {
            Thread.sleep(200);
        }
    }
}
