package ca.quickheaven.ocjp.practice.test.two;

import java.util.Arrays;
import java.util.List;

public class Question35 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.stream().filter(x -> {
            System.out.println(x);
            return x % 2 == 0;
        });

        // What is printed out when the above code is compiled and run?
        // >> Nothing
        // All intermediate operations, including filtering, do not start until a terminal operation is called on the stream.
    }
}
