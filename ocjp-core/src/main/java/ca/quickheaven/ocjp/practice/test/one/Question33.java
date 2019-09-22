package ca.quickheaven.ocjp.practice.test.one;

import ca.quickheaven.ocjp.func.prog.ch04.PredicateImpl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question33 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-2, -1, 0, 1, 2);

        Predicate<Integer> positive = i -> {
            System.out.print(i);
            return i > 0;
        };

        Predicate<Integer> negative = i -> {
            System.out.print(i);
            return i < 0;
        };
        list.stream()
                .filter(positive)       // -2 to 0 go through the filter. when the first positive number enters the pipeline, it gets printed once (1)
                .allMatch(negative);    // when the this number reaches allMatch method, the negative predicate returns false.
        // What is printed out when the above code is compiled and run?
        // -2-1011

    }

}
