package ca.quickheaven.ocjp.date;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class InstantExample {

    public static void main(String[] args) {
        // The instant class represents a specific moment in time in the GMT time zone. Suppose that you want to run a timer:
        Instant now = Instant.now();
        // do something time consuming
        Instant later = Instant.now();

        Duration duration = Duration.between(now, later);
        System.out.println(duration);   // PT0S

        // If you have a ZonedDateTime, you can turn it into an Instant:
        LocalDate date = LocalDate.of(2015, 5, 25);
        LocalTime time = LocalTime.of(11, 55, 00);

        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        Instant instant = zonedDateTime.toInstant(); //
        System.out.println(zonedDateTime);  // 2015-05-25T11:55-04:00[US/Eastern]
        System.out.println(instant);        // 2015-05-25T15:55:00Z

        // If you have the number of seconds since 1070, you can also create an Instant that way:
        Instant instant1 = Instant.ofEpochSecond(zonedDateTime.toEpochSecond());
        System.out.println(instant1); // 2015-05-25T15:55:00Z

        // Using that instant, you can do math. Instant allows you to add a ny unit day or smaller for example:
        Instant nextDay = instant1.plus(1, ChronoUnit.DAYS);
        System.out.println(nextDay);    // 2015-05-25T15:55:00Z

        Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
        System.out.println(nextHour);   // 2015-05-25T16:55:00Z

        Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS); // UnsupportedTemporalTypeException: Unsupported unit: Weeks

    }
}
