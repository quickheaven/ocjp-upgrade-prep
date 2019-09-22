package ca.quickheaven.ocjp.practice.test.one;

import ca.quickheaven.ocjp.practice.test.vo.FullName;
import ca.quickheaven.ocjp.practice.test.vo.Person;

import java.util.Arrays;
import java.util.List;

public class Question38 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", "Warner"), new Person("Richard", "Branson"));
        // How should the FullName interface be defined to make the above code snippet print out the full name of each
        // Person element when compiled and run
        FullName func = p -> System.out.print(p.getFirstName() + " " + p.getLastName());
        people.forEach(p -> func.getFullName(p));
    }
}
