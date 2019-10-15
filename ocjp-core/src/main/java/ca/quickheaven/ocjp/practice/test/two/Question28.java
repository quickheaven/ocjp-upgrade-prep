package ca.quickheaven.ocjp.practice.test.two;

import ca.quickheaven.ocjp.practice.test.vo.Movie;

import java.util.Arrays;
import java.util.List;

public class Question28 {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(new Movie("Fifty Shades of Grey", "Adult"), new Movie("Shakespeare in Love", "Romance"));

        // What change needs to be made to the main method to print out movies with both old and new labels after relabelling.
        /*
        movies.stream()
                .peek(m -> System.out.println(m.toString("old"))) // 1
                .map(m -> reLabel(m)) // 2
                .peek(m -> System.out.println(m.toString("new")) // 3
                );
        */
        // >> Change the method name at line // 3 from peek to forEach
        movies.stream()
                .peek(m -> System.out.println(m.toString("old"))) // 1
                .map(m -> reLabel(m)) // 2
                .forEach(m -> System.out.println(m.toString("new")) // 3
                );
    }

    static Movie reLabel(Movie movie) {
        String oldLabel = movie.getLabel();
        if (oldLabel.equalsIgnoreCase("Adult")) {
            movie.setLabel("18+");
        }
        return movie;
    }
}
