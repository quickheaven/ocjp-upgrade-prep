package ca.quickheaven.ocjp.practice.test.two;

import java.util.Arrays;
import java.util.List;

public class Question30 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        // int count = list.stream().filter(i -> i % 2 == 0).count();
        // System.out.println(count);

        // >> Compilation fails. the count variable is of type int while the right-hand side of the assignment returns a long.
    }
}
