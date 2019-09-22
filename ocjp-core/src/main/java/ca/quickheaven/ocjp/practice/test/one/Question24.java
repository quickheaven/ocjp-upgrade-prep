package ca.quickheaven.ocjp.practice.test.one;

import java.util.ArrayList;
import java.util.List;

public class Question24 {

    public static void main(String[] args) {
        // What happens when the following code fragment is compiled and run?
        // >> Compilation fails. (The count() returns long while amount is int)
        List<Character> list = new ArrayList<>();
        for (char c = 'z'; c >= 'a'; c--) {
            list.add(c);
        }
        // int amount = list.stream().filter(c -> c.compareTo('u') > 0).count();
    }
}
