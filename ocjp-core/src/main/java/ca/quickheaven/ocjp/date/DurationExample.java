package ca.quickheaven.ocjp.date;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

public class DurationExample {

    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1);                // PT24H
        Duration hourly = Duration.ofHours(1);              // PT1H
        Duration everyMinute = Duration.ofMinutes(1);       // PT1M
        Duration everyTenSeconds = Duration.ofSeconds(10);  // PT10S
        Duration everyMilli = Duration.ofMillis(1);         // PT0.001S
        Duration everyNano = Duration.ofNanos(1);           // PT0.000000001S

        System.out.println(daily);
        System.out.println(hourly);
        System.out.println(everyMinute);
        System.out.println(everyTenSeconds);
        System.out.println(everyMilli);
        System.out.println(everyNano);

        // Duration includes another more generic factory. It takes a number and a Temporal Unit. The idea is, something
        // like "5 seconds"
        Duration dailyChronoUnit = Duration.of(1, ChronoUnit.DAYS);                 // PT24H
        Duration hourlyChronoUnit = Duration.of(1, ChronoUnit.HOURS);               // PT1H
        Duration everyMinuteChronoUnit = Duration.of(1, ChronoUnit.MINUTES);        // PT1M
        Duration everyTenSecondsChronoUnit = Duration.of(10, ChronoUnit.SECONDS);   // PT10S
        Duration everyMilliChronoUnit = Duration.of(1, ChronoUnit.MILLIS);          // PT0.001S
        Duration everyNanoChronoUnit = Duration.of(1, ChronoUnit.NANOS);            // PT0.000000001S

        System.out.println(dailyChronoUnit);
        System.out.println(hourlyChronoUnit);
        System.out.println(everyMinuteChronoUnit);
        System.out.println(everyTenSecondsChronoUnit);
        System.out.println(everyMilliChronoUnit);
        System.out.println(everyNanoChronoUnit);

        // Using a Duration works the same way as using a Period, for example:
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Duration duration = Duration.ofHours(6);

        System.out.println(dateTime.plus(duration));    // 2015-01-20T12:15
        System.out.println(time.plus(duration));        // 12:15
        try {
            System.out.println(date.plus(duration));    // UnsupportedTemporalTypeException
        } catch (UnsupportedTemporalTypeException e) {
            e.printStackTrace();
        }

        // Remember that Period and Duration are not equivalent. This example shows a Period and Duration of the same length
        LocalDate dateEq = LocalDate.of(2015, 5, 25);
        Period period = Period.ofDays(1);
        Duration days = Duration.ofDays(1);

        System.out.println(dateEq.plus(period));    // 2015-05-26
        try {
            System.out.println(dateEq.plus(days));  // UnsupportedTemporalTypeException: Unsupported unit: Seconds
        } catch (UnsupportedTemporalTypeException e) {
            e.printStackTrace();
        }
    }

}
