package ca.quickheaven.ocjp.practice.test.one;

import java.util.function.UnaryOperator;

public class Question36 {

    public static void main(String[] args) {
        String text = "world";
        text = text.toUpperCase(); // 1
        //UnaryOperator<String> operator = s -> s.concat(text); // 2 Compilation fails because text is not final
        //System.out.println(operator.apply("HELLO"));
    }
}
