package ca.quickheaven.ocjp.practice.test.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question8 {

    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>(); // 1
        list.add(new HashMap<>()); // 2
        Map<?, ?> map = list.get(0); // 3
        // map.put("key", "value"); // 4 Compiler error. key and value types of variable map is unspecified, there is no guarantee that an Entry<String, String> can be fit into this map.77
    }
}
