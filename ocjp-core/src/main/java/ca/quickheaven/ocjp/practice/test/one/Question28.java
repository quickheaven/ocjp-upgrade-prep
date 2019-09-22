package ca.quickheaven.ocjp.practice.test.one;

import java.util.stream.IntStream;

public class Question28 {

    public static void main(String[] args) {
        System.out.println(IntStream.range(3, 1).parallel().findFirst().orElse(0)); // 0
    }

}
