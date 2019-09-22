package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question29 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        Stream.of(strings, integers).flatMap(e -> Stream.of(e)).forEach(System.out::print); // [a, b, c, d][1, 2, 3, 4]
    }

}
