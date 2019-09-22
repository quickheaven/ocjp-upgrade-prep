package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.List;

public class Question45 {

    public static void main(String[] args) {
        // What happens when the following code fragment is compiled and run?
        List<String> list = Arrays.asList(null, "null");
        for (String s : list) {
            switch (s) {
                case "null":
                    System.out.println("null");
                    break;
                default:
                    System.out.println("not null");
            }
        }
        // An exception is thrown at runtime
    }
}
