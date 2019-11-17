package ca.quickheaven.ocjp.practice.test.four;

import java.util.function.Function;

public class Question38 {

    public static void main(String[] args) {
        // What is the output?
        // >> Compilation fails due to multiple errors.
        // Function<Integer, Double> f = Function.identity(); // Incompatible types. Required Function<Integer, Double> but 'identity' was inferred to Function<T, T>: Incompatible equality constraint: Integer and Double.
        // System.out.println(f.apply(10.00)); // apply(java.lang.Integer) in Function cannot be applied to (double)
    }
}
