package ca.quickheaven.ocjp.func.prog.ch04;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * A Function is responsible for turning one parameter into a value of a potentially different type and returning it.
 * Similarly, a BiFunction is responsible for turning two parameters into a value and returning it.
 */
public class FunctionImpl {

    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();


        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));

        // The first two types in the BiFunction are the input types. The third is the result type.
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby", "chick"));
        System.out.println(b2.apply("baby", "chick"));

    }
}
