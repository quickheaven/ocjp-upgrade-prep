package ca.quickheaven.ocjp.practice.test.three;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Question43 {

    public static void main(String[] args) {
        Stream<String> strings = Stream.of("United", "States");
        BinaryOperator<String> operator = (s1, s2) -> s1.concat(s2.toUpperCase());
        String result = strings.reduce("-", operator);
        System.out.println(result); // -UNITEDSTATES
    }

}
