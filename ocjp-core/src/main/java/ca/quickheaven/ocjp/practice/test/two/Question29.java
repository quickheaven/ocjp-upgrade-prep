package ca.quickheaven.ocjp.practice.test.two;

import ca.quickheaven.ocjp.practice.test.vo.Lorien;
import ca.quickheaven.ocjp.practice.test.vo.LorienComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question29 {

    public static void main(String[] args) {
        List<Lorien> loriens = Arrays.asList(
                new Lorien(4, "John"),
                new Lorien(6, "John"),
                new Lorien(7, "John"),
                new Lorien(10, "John")
        );
        loriens.stream()
                // insert here
                .forEach(System.out::println);

        // What of the following options when put into // insert here NOT make the fragment print out Lorien
        // names in alphabetical order?

        loriens.stream()
                .sorted(Comparator.comparing(l -> l.getName())) // OK
                .sorted(Lorien::compareTo) // OK
                // .sorted(LorienComparator::compare) // Compilation error. The compare method is invoked in a static way although it is defined as a instance method.
                .map(l -> l.getName()).sorted() // OK
                // insert here
                .forEach(System.out::println);

    }
}
