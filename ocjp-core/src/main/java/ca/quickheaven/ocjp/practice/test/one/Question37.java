package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question37 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(13, 58, 9, 34);
        int max = 0; // insert here

        max = list.stream().reduce((a, b) -> a < b ? a : b).get(); // 9

        max = list.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b); // 59

        max = list.stream().max(Comparator.comparing(a -> a)).get(); // 59

        max = list.stream().max(Comparator.comparingInt(a -> a)).get(); // 59

        // Which of the following statements when put into // insert here will NOT make the above snippet print out the largest number of the list?
        System.out.println(max);
    }

}
