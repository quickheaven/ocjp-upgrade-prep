package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.List;

public class Question26 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // Which of the following statements print out the sum of all elements of the given list.

        // int sum = list.stream().reduce((x, y) -> x +y); // compiler error because reduce Optional

        double sum = list.stream().mapToInt(x -> x).sum(); // OK
        System.out.println(sum);

        // int sum = list.stream().mapToDouble(x -> x).sum(); // compiler error because .sum() returns double.

        double sum1 = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum1);

        // double sum2 = 0; list.stream().forEach(x -> { sum2 += x;}); // compiler error because sum2 should be final
    }
}
