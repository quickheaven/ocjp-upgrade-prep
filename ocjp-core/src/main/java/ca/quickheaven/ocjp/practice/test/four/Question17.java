package ca.quickheaven.ocjp.practice.test.four;

import java.util.ArrayList;
import java.util.List;

public class Question17 {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(2);
        ints.add(3);

        ints.replaceAll(i -> i / 2);

        System.out.println(ints); // [0, 1, 1]

        // What is the output?
        // >> 2
        System.out.println(ints.stream().distinct().count());

    }
}
