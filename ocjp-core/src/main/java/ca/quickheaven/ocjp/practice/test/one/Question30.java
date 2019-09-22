package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question30 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5);
        // Optional<Integer> optional = Optional.of(list.stream().filter(i -> i % 2 == 0).reduce((i, j) -> i + j)); // 1 Compilation error because reduce returns Optional
        // System.out.println(optional);
    }
}
