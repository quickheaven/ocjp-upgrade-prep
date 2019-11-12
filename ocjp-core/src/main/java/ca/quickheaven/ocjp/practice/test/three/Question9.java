package ca.quickheaven.ocjp.practice.test.three;

import ca.quickheaven.ocjp.practice.test.vo.Data;

import java.util.Optional;
import java.util.stream.Stream;

public class Question9 {

    public static void main(String[] args) {
        // What happens when the following code fragment is compiled and run?
        Stream<Data> stream = Stream.of(new Data(1), new Data(2), new Data(3), new Data(4));
        Optional<Data> optional = stream
                //.anyMatch(d -> d.getValue() % 2 == 0)
                .filter(d -> d.getValue() % 2 == 0)
                .findAny();
        System.out.println(optional.get().getValue());
        // >> Compilation Fails. Stream.anyMatch is a terminal operation returning a boolean value. We cannot append any
        // operation to the pipeline after that.
    }
}
