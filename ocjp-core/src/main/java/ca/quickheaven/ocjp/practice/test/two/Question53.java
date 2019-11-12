package ca.quickheaven.ocjp.practice.test.two;

import java.util.Set;
import java.util.TreeSet;

public class Question53 {

    public static void main(String[] args) {
        Set<String> greetings = new TreeSet<>();
        greetings.add("Welcome");
        greetings.add("to");
        greetings.add("the");
        greetings.add("World");
        for (String name : greetings) {
            switch (name) {
                case "Welcome":
                    System.out.print("Welcome ");
                    break;
                case "to":
                    System.out.print("to ");
                    break;
                case "the":
                    System.out.print("the ");
                    break;
                case "World":
                    System.out.print("World ");
                    break;
            }
        }
        // What happens when the following code fragment is compiled and run?
        // >> It prints out "Welcome World the to".
    }
}
