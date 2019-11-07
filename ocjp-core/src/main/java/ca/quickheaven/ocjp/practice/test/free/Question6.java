package ca.quickheaven.ocjp.practice.test.free;

import java.util.function.BiFunction;

public class Question6 {

    public int addNumber(int number1, int number2) {
        int sum = new Calculator() {
            public int calculate(int num1, int num2) {
                return num1 + num2;
            }
        }.calculate(number1, number2);
        return sum;
    }

    interface Calculator {
        int calculate(int number1, int number2);
    }

    // What functional interface from the java.util.function package can be used to make the above code more concise?
    // >> BiFunction

    public int addNumberFunc(int number1, int number2) {
        BiFunction<Integer, Integer, Integer> func = (a, b) -> a + b;
        return func.apply(number1, number1);
    }
}
