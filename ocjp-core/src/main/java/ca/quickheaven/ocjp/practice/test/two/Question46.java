package ca.quickheaven.ocjp.practice.test.two;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Question46 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        UnaryOperator<String> operator = s -> s.toLowerCase(); // 1
        Consumer<String> consumer = System.out::println; // 2
        list.stream().map(operator).forEach(consumer); // 3

        // What happens when the above code is compiled and executed?
        // >> It prints out "abc"
    }
}
