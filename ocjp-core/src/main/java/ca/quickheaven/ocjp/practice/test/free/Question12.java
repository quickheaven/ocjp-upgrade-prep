package ca.quickheaven.ocjp.practice.test.free;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question12 {

    public static void main(String[] args) {
        // What is the result?
        IntStream stream = IntStream.range(1, 5);
        Stream<Integer> numbers = stream.boxed();
        Object object = numbers.collect(Collectors.partitioningBy(x -> x * 4 > 10));
        System.out.println(object); // >> {false=[1,2], true=[3,4]}
    }
}
