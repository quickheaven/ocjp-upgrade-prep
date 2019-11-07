package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Question4 {

    public static void main(String[] args) {

        // What happens when the given fragment is compiled and run?
        // >> It prints out a list of characters but the letter case is uncertain.
        CopyOnWriteArrayList<String> data = new CopyOnWriteArrayList<>(Arrays.asList("a", "B", "c", "D"));

        new Thread() {
            public void run() {
                data.set(0, "a");
                data.set(1, "b");
                data.set(2, "c");
                data.set(3, "d");
            }
        }.start();

        new Thread() {
            public void run() {
                data.set(0, "A");
                data.set(1, "B");
                data.set(2, "C");
                data.set(3, "D");
            }
        }.start();

        System.out.println(data);
    }
}
