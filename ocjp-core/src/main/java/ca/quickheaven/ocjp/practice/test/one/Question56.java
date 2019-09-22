package ca.quickheaven.ocjp.practice.test.one;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Question56 {

    public static void main(String[] args) {
        ZonedDateTime timeBeforeChange = ZonedDateTime.of(LocalDateTime.of(2017, Month.MARCH, 12, 2, 29), ZoneId.of("US/Pacific"));

        ZonedDateTime timeAfterChange = ZonedDateTime.of(LocalDateTime.of(2017, Month.MARCH, 12, 3, 0), ZoneId.of("US/Pacific"));

        System.out.println(ChronoUnit.MINUTES.between(timeBeforeChange, timeAfterChange)); // difference between 3:29 to 3:00 returns -29
    }
}
