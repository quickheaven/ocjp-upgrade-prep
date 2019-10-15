package ca.quickheaven.ocjp.practice.test.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question6 {

    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();
        map.put("key", new ArrayList<>()); // 1
        // List<> value = map.get("key"); // 2 compiler error
    }
}
