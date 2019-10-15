package ca.quickheaven.ocjp.practice.test.two;

import java.util.Arrays;
import java.util.List;

public class Question10 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8);
        boolean allEven = list.stream().allMatch(i -> {
            System.out.print(i); // 2468
            return i % 2 == 0;
        });

    }
}
