package ca.quickheaven.ocjp.practice.test.two;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Question34 {

    public static void main(String[] args) {

        IntStream ints = IntStream.range(0, 10);
        IntPredicate even = i -> i % 2 == 0; // 1
        IntPredicate odd = i -> i % 2 == 1; // 1

        int totalEven = ints.filter(even).sum(); // 2
        int totalOdd = ints.filter(odd).sum(); // 2

        System.out.println(totalEven + " " + totalOdd);

        // What happens when the above snippet is compiled and run?
        // >> An exception is thrown at runtime.
        // Remember that after the terminal operation is performed, the stream pipeline is considered consumed, and can no longer be used.
    }
}
