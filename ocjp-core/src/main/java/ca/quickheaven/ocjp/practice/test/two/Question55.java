package ca.quickheaven.ocjp.practice.test.two;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Question55 {

    public static void main(String[] args) {
        Instant instant = Instant.parse("2017-06-30T12:00:00z");
        instant.plus(1, ChronoUnit.HOURS); // gone...
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.of("US/Pacific"));
        System.out.print(instant);
        System.out.print(dateTime);
        // What happens when the fragment given above is compiled and run?
        // >> 2017-06-30T12:00:00Z2017-06-30T05:00

    }
}
