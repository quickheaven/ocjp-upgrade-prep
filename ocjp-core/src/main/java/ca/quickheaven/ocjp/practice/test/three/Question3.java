package ca.quickheaven.ocjp.practice.test.three;

import java.util.stream.IntStream;

public class Question3 {

    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 4);
        // Object val = intStream.collect(Collectors.partitioningBy(i -> i % 2 == 0)).get(true);
        // System.out.println(val);
        // What happens with the above fragment is compiled and run?
        // >> Compilation fails.
    }
}
