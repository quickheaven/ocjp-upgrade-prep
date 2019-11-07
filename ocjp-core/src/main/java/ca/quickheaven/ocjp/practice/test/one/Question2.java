package ca.quickheaven.ocjp.practice.test.one;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Question2 { // MyApp

    // What happens when te MyApp class is compiled and run?
    // >> It prints out the following (order of both lines does not matter): Thread 1 is running Thread 2  is running

    public static void main(String[] args) throws InterruptedException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
            public void run() {
                System.out.println("the main thread prepares to complete.");
            }
        });

        new Question2(cyclicBarrier);
    }

    CyclicBarrier cyclicBarrier;

    public Question2(CyclicBarrier cyclicBarrier) throws InterruptedException {
        this.cyclicBarrier = cyclicBarrier;
        new Thread(new Worker(1)).start();
        new Thread(new Worker(2)).start();
    }

    class Worker implements Runnable {
        private int id;

        Worker(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println("Thread " + id + " is running");
            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}




