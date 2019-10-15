package ca.quickheaven.ocjp.practice.test.two;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class Question21 {

    public static void main(String[] args) {
        /*
        LocalDateTime dateTime1 = LocalDateTime.of(2017, Month.JANUARY, 1, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2017, Month.JANUARY, 2, 0);
        Duration duration = Duration.between(dateTime1, dateTime2);
        System.out.println(duration);
        */
        // What happens when this fragment is compiled and run?
        // >> Compilation fails. LocalDateTime.of is a non-existent factory method. LocalDateTime.of overriding methods require time information to at least the level of minutes.

    }
}
