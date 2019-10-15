package ca.quickheaven.ocjp.practice.test.two;

import ca.quickheaven.ocjp.practice.test.vo.Upperization;

import java.util.function.Function;

public class Question42 {

    public static void main(String[] args) {

        // Here is how that interface is used to convert a String ot its upper-case version.
        String input = "I am a lower-case string";
        String output = new Upperization() {
            @Override
            public String upperize(String input) {
                return input.toUpperCase();
            }
        }.upperize(input);
        System.out.println(output);

        // Which functional interface from the java.util.function can be used to refactor the given code to make it concise?
        // >> Function

        Function<String, String> function = s -> s.toUpperCase();
        String output1 = function.apply(input);
        System.out.println(output1);

    }
}
