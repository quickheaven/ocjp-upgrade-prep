package ca.quickheaven.ocjp.date;

import java.time.*;

public class DSTExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.NOVEMBER, 6);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);

        System.out.println(dateTime); // 2016-11-06T01:30-04:00[US/Eastern]

        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2016-11-06T01:30-05:00[US/Eastern]

        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2016-11-06T02:30-05:00[US/Eastern]

        // Did you get it? We went from 5:30 GMT to 6:30 GMT to 7:30 GMT.
        // Trying to create a time that doesnt exist just rolls forward:
        LocalDate localDate = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime localTime = LocalTime.of(2, 30);
        // ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime); // 2016-11-06T02:30-05:00[US/Eastern]
        // Java is smart enough to know that there is no 2:30 a.m. that night and switches over to the appropriate GMT offset.


    }
}
