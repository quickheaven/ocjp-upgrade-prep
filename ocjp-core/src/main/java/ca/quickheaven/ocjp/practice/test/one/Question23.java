package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question23 {

    public static void main(String[] args) {
        // What happens when te above fragment is compiled and executed?
        // >> abcd
        List<String> sList = Arrays.asList("a", "b", "c", "d");
        sList.stream().filter(s -> s.compareTo("c") < 0).collect(Collectors.joining("-")); // a-b (This output is not assigned to any visible to any variable and will be lost!)
        sList.stream().forEach(System.out::print); // abcd
    }
}
