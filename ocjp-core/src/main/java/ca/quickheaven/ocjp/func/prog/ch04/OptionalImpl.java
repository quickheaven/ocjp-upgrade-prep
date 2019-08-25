package ca.quickheaven.ocjp.func.prog.ch04;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalImpl {

    public static void main(String[] args) {
        System.out.println(average(90, 100)); // Optional[95.0]
        System.out.println(average()); // Optional.empty

        Optional<Double> opt1 = average(90, 100);
        if (opt1.isPresent()) {
            System.out.println(opt1.get()); // bad
        }

        Optional<Double> opt2 = average();
        try {
            System.out.println(opt2.get()); // java.util.NoSuchElementException: No value present
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

        // We use the ternary operator to make sure how Optional works
        Long value = null;
        // If value is null, o is assigned the empty Optional. Otherwise, we wrap the value.
        Optional o1 = (value == null) ? Optional.empty() : Optional.of(value);
        // Since this is such a common pattern, Java provides a factory method to do the same thing:
        Optional o2 = Optional.ofNullable(value);

        // Optional instance methods
        opt1.ifPresent(System.out::println); // Calls Consumer c with value

        System.out.println(opt2.orElse(Double.NaN)); // NaN
        System.out.println(opt2.orElseGet(() -> Math.random())); // 0.12385631616977166
        System.out.println(opt2.orElseThrow(() -> new IllegalStateException())); // Exception in thread "main" java.lang.IllegalStateException


    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }
}
