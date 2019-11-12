package ca.quickheaven.ocjp.practice.test.three;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

    public static void main(String[] args) {

        // Which TWO of the following codes fragments can be used to invoked the above code.
        // ArrayList<Integer> listA = new ArrayList<>();
        // List<Number> numbersA = process(listA);

        ArrayList<Number> listB = new ArrayList<>();
        List<? extends Number> numbersB = process(listB);

        //ArrayList<Number> listC = new ArrayList<>();
        //List<Object> numbersC = process(listC);

        ArrayList<Integer> listD = new ArrayList<>();
        List<? super Integer> numbersD = process(listD);
    }

    public static <T extends Number> List<T> process(List<T> args) {
        return null;
    }
}
