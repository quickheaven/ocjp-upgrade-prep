package ca.quickheaven.ocjp.practice.test.one;

import ca.quickheaven.ocjp.practice.test.vo.Validator;

import java.util.function.Predicate;

public class Question39 {

    public static void main(String[] args) {
        Validator validator = new Validator(true);
        // System.out.println(new Question39().validate(validator, validator -> validator.isValid())); // 1

        // Compilation fails at // 1
        // a lambda expression must declare new variables (validator) in the parameter list to be used in its body.
    }
    public boolean validate(Validator validator, Predicate<Validator> predicate) {
        return predicate.test(validator); // 2
    }
}
