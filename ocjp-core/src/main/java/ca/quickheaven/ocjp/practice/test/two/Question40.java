package ca.quickheaven.ocjp.practice.test.two;

import ca.quickheaven.ocjp.practice.test.vo.Data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Question40 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        // Which of the following options will make the fragment print "1234" when placed at // insert here?

        list.stream().map(i -> {
            Function<Integer, Data> func = Data::new;
            return func.apply(i);
        }).forEach(Data::output);
    }
}
