package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Question25 {

    public static void main(String[] args) {
        // Given the following code fragment:
        List<AtomicBoolean> bools = Arrays.asList(new AtomicBoolean(false), new AtomicBoolean(true));

        bools.stream().filter(b -> {
            // Before the elements are discard because of filter, all statements prior to the return statement within the provided predicate are expected for every element
            System.out.println(b); // false true -- get printed when the stream goes through the filter method
            return b.get();
        }).forEach(System.out::print); // true -- gets printed again when reaching the terminal operation.

        // When happens when this code is compiled and run?
        // >> falsetruetrue
    }
}
