package ca.quickheaven.ocjp.practice.test.one;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.List;

public class Question8 {

    public static void main(String[] args) {
        // What is the line where a compile error occurs? (3)
        List<String> list = new ArrayList<>();
        List<? super String> subList = new ArrayList<>(); // 1
        list.addAll(new ArrayList<>()); // 2
        // list.addAll(subList); // 3
    }

}
