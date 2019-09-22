package ca.quickheaven.ocjp.practice.test.one;

import ca.quickheaven.ocjp.practice.test.vo.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question34 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("John", "Doe"),
                new Person("Jane", "Roe"),
                new Person("John", "Roe"),
                new Person("Jane", "Doe")));

        Predicate<Person> firstName = p -> p.getFirstName().equals("John");
        Predicate<Person> lastName = p -> p.getLastName().equals("Doe");
        // insert here
        // What statement should be placed at // insert here to make the following code fragment print out "John Doe"?

        people.stream().filter(firstName).filter(lastName)
                .forEach(p -> System.out.println(p.getFirstName() + " " + p.getLastName()));
    }
}
