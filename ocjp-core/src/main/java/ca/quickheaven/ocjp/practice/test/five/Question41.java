package ca.quickheaven.ocjp.practice.test.five;

import java.util.function.ToDoubleBiFunction;

public class Question41 {

    public static void main(String[] args) {
        ToDoubleBiFunction<Integer, Integer> ob = (f1, f2) -> f1 + f2;

        // System.out.println(ob.apply(1, 2)); Compilation error.

        System.out.println(ob.applyAsDouble(1, 2));
    }
}
