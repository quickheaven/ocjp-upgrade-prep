package ca.quickheaven.ocjp.practice.test.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Question38 {

    public static List<Integer> calculate(List<Integer> oldList, Function<Integer, Integer> function) {
        List<Integer> newList = new ArrayList<>();
        for (Integer element : oldList) {
            newList.add(function.apply(element));
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4);
        List<Integer> result =  // insert here
                calculate(l, (Integer i) -> i * 2);
        //calculate(l, (Integer i) -> return (i * 2));
        //calculate(l, i -> {return (i * 2)});
        //calculate(l, i ->  {i * 2});


        System.out.println(result);

    }
}
