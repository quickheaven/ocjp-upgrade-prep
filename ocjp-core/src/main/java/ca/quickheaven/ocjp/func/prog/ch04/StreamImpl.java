package ca.quickheaven.ocjp.func.prog.ch04;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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
        Stream<String> sFind = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        sFind.findAny().ifPresent(System.out::println); // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp

        // allMatch(), anyMatch() and nonMatch()
        // The allMatch(), anyMatch() and noneMatch() methods search a stream and return information about how the stream
        // pertains to the predicate.
        List<String> listMatch = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infiniteMatch = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(listMatch.stream().anyMatch(pred)); // true
        System.out.println(listMatch.stream().allMatch(pred)); // false
        System.out.println(listMatch.stream().noneMatch(pred)); // false
        System.out.println(listMatch.stream().anyMatch(pred)); // true

        // Remember that allMatch(), anyMatch() and noneMatch() return a boolean. By contrast, the find methods return an
        // Optional because they return an element of the stream.


        // forEach()
        Stream<String> sForEach = Stream.of("Monkey", "Gorilla", "Bonobo");
        sForEach.forEach(System.out::print); // MonkeyGorillaBonobo


        // reduce()
        // The reduce() method combines a stream into a single object.
        // before lambda:
        String[] array = new String[]{"w", "o", "l", "f"};
        String result = "";
        for (String s : array) result = result + s;
        System.out.println(result); // wolf

        // with lambda
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf

        // with lambda (rewrite)
        stream = Stream.of("w", "o", "l", "f");
        word = stream.reduce("", String::concat);
        System.out.println(word); // wolf

        // Can you write a reduction to multiply all of the Integer objects in a stram?
        Stream<Integer> stream1 = Stream.of(3, 5, 6);
        System.out.println(stream1.reduce(1, (a, b) -> a * b)); // 90

        // (a) If the stream is empty, an empty Optional is returned.
        // (b) If the stream has one element, it is returned.
        // (c) If the stream has multiple elements, the accumulator is applied to combine them
        // The following illustrates each of these scenarios:
        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println); // no output (a)
        oneElement.reduce(op).ifPresent(System.out::println); // 3 (b)
        threeElements.reduce(op).ifPresent(System.out::println); // 90 (c)


        // collect()
        // The collect() method is a special type of reduction called a mutable reduction. It is more efficient that a
        // regular reduction because we use the same mutable object while accumulating.

        // The first parameter is a Supplier that creates the object that will store the results as we collect data.
        // Remember that a Supplier doesnt take any parameters and return a value. In this case, it constructs a new StringBuilder
        // The second parameter is a BiConsumer, which takes two parameter and doesnt return anything. It is responsible
        // for adding one more element to the data collection. In this example, it appends the next String to the StringBuilder.
        // the final parameter is another BiConsumer. It is responsible for taking two data collections and merging it.
        stream = Stream.of("w", "o", "l", "f");
        StringBuilder wordSb = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(wordSb); // wolf

        // Example where the logic is different in the accumulator and combiner.
        // The collector has three parts as before. The supplier creates an empty TreeSet. The accumulator add a single
        // String from the Stream to the TreeSet. The combiner adds all of the elements of one TreeSet to another in case
        // the operations were done in parallel and need to be merged.
        stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set1 = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set1); // [f, l, o, w]

        // we can rewrite the previous example as follows:
        stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set2 = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set2); // [f, l, o, w]

        // If we didnt need the set to be sorted, we could make the code even shorter:
        stream = Stream.of("w", "o", "l", "f");
        Set<String> set3 = stream.collect(Collectors.toSet());
        System.out.println(set3); // [f, w, l, o]

    }
}
