package ca.quickheaven.ocjp.practice.test.free;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question15 {

    public static void main(String[] args) {
        // Choose THREE correct statements that can be used to create a thread pool:
        ExecutorService threadPool1 = Executors.newFixedThreadPool(1);

        ExecutorService threadPool2 = Executors.newCachedThreadPool();

        ExecutorService threadPool3 = Executors.newSingleThreadExecutor();
    }
}
