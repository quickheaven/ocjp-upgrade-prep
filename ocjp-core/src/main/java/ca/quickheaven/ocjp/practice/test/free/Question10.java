package ca.quickheaven.ocjp.practice.test.free;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question10 {

    public static void main(String[] args) {
        // Insert a statement at // insert here to make the following code fragment work:
        // insert here
        List<Map<Integer, String>> list = new ArrayList<>();
        // or
        List<Map<Integer, String>> list1 = new ArrayList<Map<Integer, String>>();

        Map<Integer, String> people = new HashMap<>();
        people.put(1, "Alice");
        people.put(2, "Bob");
        list.add(people);
    }
}
