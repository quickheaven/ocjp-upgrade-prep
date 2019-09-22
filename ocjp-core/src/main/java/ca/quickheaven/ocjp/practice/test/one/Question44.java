package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Question44 {

    static int calculate(List<String> list, Function<List<String>, Integer> func) {
        return func.apply(list);
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c");
        System.out.println(calculate(list, s -> s.indexOf("b")));

    }
}
