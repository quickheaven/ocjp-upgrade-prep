package ca.quickheaven.ocjp.practice.test.one;

import ca.quickheaven.ocjp.practice.test.vo.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question32 {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(new Book("The Fountainhead", "Ayn Rand"),
                new Book("A Farewell to Arms", "Ernest Hemingway"),
                new Book("War and Piece", "Leo Tolstoy"));

        List<String> titles = new ArrayList<>();
        // insert here

        // Which of the following statements inserted to // insert here allows the fragment to print out the list of all book titles?
        // books.stream().map(Book::getTitle).collect(Collectors.toList(titles)); // Collectors.asList does not accept any arguments
        titles = books.stream().map(Book::getTitle).collect(Collectors.toList());

        // titles = books.stream().map(Book::getTitle).forEach(b -> titles.add(b)); // Stream.forEach does not return any value (void).

        System.out.println(titles);

    }
}
