package ca.quickheaven.ocjp.practice.test.two;

import ca.quickheaven.ocjp.practice.test.vo.Movie;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Question12 {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", 9.5);
        Movie movie2 = new Movie("Quantum of Solace", 6.5);
        Movie movie3 = new Movie("Skyfall", 9.3);
        Movie movie4 = new Movie("Spectre", 6.5);

        List<Movie> movies = Arrays.asList(movie1, movie2, movie3, movie4);

        // What is the valid way to print out the average rating of all the given values.
        double average = 0.0;

        // average = movies.stream().mapToDouble(m -> m.getRating()).average(); Compilation error. The average() returns OptionalDouble instance, which cannot be automatically cast to a double.

        ToDoubleFunction<Movie> func = Movie::getRating;
        average = movies.stream().collect(Collectors.averagingDouble(func));

        System.out.println(average); // 7.95
    }
}
