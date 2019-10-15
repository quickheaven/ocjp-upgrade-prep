package ca.quickheaven.ocjp.practice.test.two;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 {

    public static void main(String[] args) {
        StringBuffer us = new StringBuffer("US");
        StringBuffer uk = new StringBuffer("UK");
        List<StringBuffer> list = Arrays.asList(us, uk);
        String output = list.stream().collect(Collectors.joining("-", "<-", "->"));
        System.out.println(output); // <-US-UK->
    }
}
