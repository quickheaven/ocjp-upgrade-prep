package ca.quickheaven.ocjp.func.prog.ch04;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamImpl {

    public static void main(String[] args) {

        creatingStreamSources();

        usingCommonTerminalOperations();

    }

    private static void creatingStreamSources() {
        // Creating Stream Sources
        Stream<String> empty = Stream.empty(); // count = 0
        Stream<Integer> singleElement = Stream.of(1); // count = 1
        Stream<Integer> fromArray = Stream.of(1, 2, 3);

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();

        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
    }

    private static void usingCommonTerminalOperations() {
        // Using common Terminal Operations
        // count()
        Stream<String> sCount = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(sCount.count()); // 3


        // min() and max()
        // The min() and max() method allows you to pass a custom comparator and find the smallest and largest value in
        // a finite stream according to that sort order.


        // Finds the animal with the fewest letters in its name
        Stream<String> sMin = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = sMin.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println); // ape

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent()); // false


        // findAny() and findFirst()
        // The findAny() and findFirst() methods return an element of the stream unless the stream is empty. If the stream
        // is empty, they return an empty Optional.
        // This example finds an animal:
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s.findAny().ifPresent(System.out::println); // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp
    }
}
