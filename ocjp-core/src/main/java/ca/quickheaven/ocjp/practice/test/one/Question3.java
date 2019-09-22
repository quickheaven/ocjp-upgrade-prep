package ca.quickheaven.ocjp.practice.test.one;

import java.util.concurrent.atomic.AtomicInteger;

public class Question3 {

    public static void main(String[] args) {
        AtomicInteger oldVal = new AtomicInteger();
        int newVal = 0; // insert here
        // Which TWO of the following statement when placed at // insert here makes the code print out number one?
        newVal = oldVal.getAndAdd(1);
        newVal = oldVal.getAndUpdate(i -> i + 1);
        System.out.println(newVal);

    }
}
