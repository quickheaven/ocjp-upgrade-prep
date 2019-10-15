package ca.quickheaven.ocjp.practice.test.two;

import java.util.concurrent.atomic.AtomicInteger;

public class Question4 {

    static AtomicInteger count = new AtomicInteger();

    public Question4() {
        count.getAndAdd(1);
    }
}
