package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.List;

public class Question40 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.forEach(i -> { i *= 2; /* System.out.println(i) *//* missing semi colon */ });
    }
}
