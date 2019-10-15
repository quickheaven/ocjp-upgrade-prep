package ca.quickheaven.ocjp.practice.test.two;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.List;

public class Question41 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(s -> s.toUpperCase()); // 1
        list.stream().filter(s -> s.compareTo("b") > 0).forEach(System.out::println); // 2
        // What happens when the above code is compiled and run?
        // >> It prints "c".
    }
}
