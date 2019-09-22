package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question42 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(14, 27, 18, 2);
        // insert code here
        // Which of the following will print the largest number in the lsit when put into // insert code here?

        System.out.println(list.stream().max(Integer::max).get()); // 14

        System.out.println(list.stream().max((a, b) -> a > b ? a : b)); // Optional[14]

        System.out.println(list.stream().max(Comparator.comparingInt(a -> a)).get()); // 27

        System.out.println(list.stream().reduce(Integer.MAX_VALUE, (a, b) -> a > b ? a : b)); // 2147483647 (Should be MIN_VALUE)
    }
}
