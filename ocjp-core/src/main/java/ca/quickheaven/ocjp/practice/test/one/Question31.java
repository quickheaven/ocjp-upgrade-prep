package ca.quickheaven.ocjp.practice.test.one;

import ca.quickheaven.ocjp.practice.test.vo.Movie;

import java.util.Arrays;
import java.util.List;

public class Question31 {

    public static void main(String[] args) {
        // What happens when the code below fragment is compiled and run?
        List<Movie> movies = Arrays.asList(new Movie("The Godfather", 9.5), new Movie("The Transporter", 8.5));

        movies.stream().peek(System.out::println)
                .filter(m -> m.getRating() >= 9.0)
                .forEach(m -> System.out.println(m.getTitle()));

        // It prints out: The Godfather The Godfather The Transporter

    }
}
