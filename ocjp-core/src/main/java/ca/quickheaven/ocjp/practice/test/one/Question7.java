package ca.quickheaven.ocjp.practice.test.one;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

    public static void main(String[] args) {
        // Which of the provided statements does NOT lead to a compiler error?
        List<? super Number> list1 = new ArrayList<>(); // 1
        List<? extends Number> list2 = new ArrayList<>(); // 2
        list1.add(1); // 3
        /*
        list2.add(1); // 4
        int num1 = list1.get(0); // 5
        int num2 = list2.get(0); // 6
        */
    }
}
