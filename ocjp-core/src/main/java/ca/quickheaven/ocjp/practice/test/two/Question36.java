package ca.quickheaven.ocjp.practice.test.two;

import java.util.function.Function;
import java.util.function.Supplier;

public class Question36 {

    private String name;

    public Question36() {
        this("Noname");
    }

    public Question36(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {

        // Which TWO of the following code fragments will print out "Noname" when compiled and run?

        Supplier<Question36> func1 = Question36::new;
        Question36 class1 = func1.get();
        System.out.println(class1.getName());

        // Supplier<Question36> func2 = Question36::new;
        // Question36 class2 = func2.get("Noname"); // Supplier cannot received any argument.
        // System.out.println(class2.getName());

        // Function<String, Question36> func3 = Question36::new;
        // Question36 class3 = func3.apply(); // The Function interface takes a single argument and return a value
        // System.out.println(class3.getName());

        Function<String, Question36> func3 = Question36::new;
        Question36 class3 = func3.apply("Noname"); // The Function interface takes a single argument and return a value
        System.out.println(class3.getName());
    }
}
