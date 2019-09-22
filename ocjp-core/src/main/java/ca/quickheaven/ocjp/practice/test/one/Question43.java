package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.List;

public class Question43 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().forEach(s -> s = s.toUpperCase());
        list.stream().forEach(System.out::print);

        // What happens when the above fragment is compiled and run?
        // It prints out "abc"
    }
}
