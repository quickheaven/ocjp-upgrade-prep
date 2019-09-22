package ca.quickheaven.ocjp.practice.test.one;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Question22 {

    public static void main(String[] args) {
        // Which of the following code fragment prints 15 when compiled and run?

        IntStream intStream = IntStream.range(1, 6);
        //Optional sum = intStream.reduce((a, b) -> a + b); // Incompatible types. reduce returns OptionalInt
        //System.out.println(sum.orElse(0));

        System.out.println(IntStream.range(1, 6).reduce((a, b) -> a + b).orElse(0)); // 15

        System.out.println(IntStream.range(1, 6).average().orElse(0)); // 3.0

        IntStream intStream1 = IntStream.range(1, 6);
        long count = intStream1.count();
        System.out.println(intStream1.average().orElse(0) * count); // IllegalStateException: stream has already been operated upon or closed
    }
}
