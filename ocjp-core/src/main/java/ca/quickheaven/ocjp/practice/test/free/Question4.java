package ca.quickheaven.ocjp.practice.test.free;

import java.util.Arrays;
import java.util.List;

class Person {
    private String name;
    private Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static boolean isFemale(Person person) {
        return person.getGender().equals(Gender.FEMALE);
    }

    enum Gender {
        MALE, FEMALE
    }

}

public class Question4 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Bob", Person.Gender.MALE), new Person("Alice", Person.Gender.FEMALE));
        people.stream()
                // Which of the following expression when put into /* 1 */ results in a compile error?
                // .filter(/* 1 */)
                // .filter(Person p -> Person.isFemale(p)) // -- compiler error
                // .filter(Person::isFemale)
                // .filter((Person p) -> new Person(p.getName(), p.getGender()).isFemale(p))
                // or
                // .filter((Person p) -> Person.isFemale(p))
                // .filter((Person p) -> {
                //     return Person.isFemale(p);
                // })
                .forEach((Person p) -> {
                    System.out.println(p.getName());
                });
    }
}
