package ca.quickheaven.ocjp.practice.test.two;

import java.util.Arrays;
import java.util.List;

public class Question11 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5);
        // Optional<Boolean> result = list.stream().noneMatch(i -> i % 2 == 1);
        // Compilation fails. Stream.noneMatch returns a boolean value instead of Optional.
        boolean result = list.stream().noneMatch(i -> i % 2 == 1);
        System.out.println(result);
    }
}
