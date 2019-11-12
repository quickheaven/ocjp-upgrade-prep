package ca.quickheaven.ocjp.practice.test.three;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question34 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        // insert here
        // System.out.println(sum);

        // Which TWO of the following options make the program print out number 10 when being placed at // insert here?

        int sumA = numbers.stream().mapToInt(x -> x).sum(); // OK

        // int sumB = 0; numbers.stream().forEach(i -> sumB += 1); // Variable used lambda expression should be final or effectively final.

        // int sumC = numbers.stream().reduce((i1, i2) -> i1 + i2); // Incompatible types. Required: int, Found: java.util.Optional

        int sumD = numbers.stream().collect(Collectors.summingInt(i -> i)); // OK

    }
}
