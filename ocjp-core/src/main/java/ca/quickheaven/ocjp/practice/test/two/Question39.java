package ca.quickheaven.ocjp.practice.test.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Question39 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        BiPredicate<Integer, Integer> predicate = (i, j) -> i % j == 0; // 1
        BiFunction<List<Integer>, Integer, List<Integer>> function = (l1, j) -> { // 2
            List<Integer> l2 = new ArrayList<>();
            for (int i : l1) {
                if (predicate.test(i, j)) {
                    l2.add(i / j);
                }
            }
            return l2;
        };
        System.out.println(function.apply(list, 2)); // It prints out "[1, 2]"
    }
}
