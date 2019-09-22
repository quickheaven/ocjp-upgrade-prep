package ca.quickheaven.ocjp.practice.test.one;

import ca.quickheaven.ocjp.practice.test.vo.Book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question27 {

    public static void main(String[] args) {
        // What happens when the following code fragment is compiled?
        List<Book> books = Arrays.asList(
                new Book("Atlas Shrugged", 50.0, "Ayn Rand"),
                new Book("Great Expectations", 30.0, "Charles Dickens"),
                new Book("Oliver Twist", 30.0, "Charles Dickens"),
                new Book("The Fountainhead", 40.0, "Ayn Rand")
        );

        books.stream().filter(b -> b.getAuthor().equals("Ayn Rand")) // 1
                .collect(Collectors.toMap(Book::getTitle, b -> b.getPrice())) // 2
                //.forEach(b -> System.out.println(b)); // 3 Compilation error because of toMap we should use two arguments
                .forEach((a, b) -> System.out.println(b));

    }

}
