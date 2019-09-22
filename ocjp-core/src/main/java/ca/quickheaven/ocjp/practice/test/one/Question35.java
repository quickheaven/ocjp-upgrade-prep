package ca.quickheaven.ocjp.practice.test.one;


import ca.quickheaven.ocjp.practice.test.vo.Person;

import java.util.function.Supplier;

public class Question35 {

    public static void main(String[] args) {
        Person person = new Person("Donald", "Trump");
        Supplier<String> supplier = person::getFullName;
        // Which statement should be placed at // insert here to make the code fragment print out the full name of a Person object?
        System.out.println(supplier.get());

    }
}
