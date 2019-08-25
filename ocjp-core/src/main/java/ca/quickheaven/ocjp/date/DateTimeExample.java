package ca.quickheaven.ocjp.date;

import java.time.*;

public class DateTimeExample {

    public static void main(String[] args) {

        creatingDatesAndTimes();

        manipulatingDatesAndTimes();

    }

    private static void creatingDatesAndTimes() {
        // Creating Dates and Times
        System.out.println(LocalDate.now()); // 2019-08-04
        System.out.println(LocalTime.now()); // 14:47:01.864
        System.out.println(LocalDateTime.now()); // 2019-08-04T14:47:01.864
        System.out.println(ZonedDateTime.now()); // 2019-08-04T14:47:01.865-04:00[America/Toronto]

        // Create a date with no time
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        // Create time
        LocalTime time1 = LocalTime.of(6, 15);                  // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30);          // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

        // Combine dates and times into one object
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        // In order to create a ZoneDateTime, we first need to get the desired time zone. We will use US/Eastern in our
        // examples:
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zoned1 = ZonedDateTime.of(2015, 6, 1, 20, 15, 30, 200, zone);
        ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
        ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);
    }

    public static void manipulatingDatesAndTimes() {
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014-01-20

        date = date.plusDays(2);
        System.out.println(date); // 2014-01-22

        date = date.plusWeeks(1);
        System.out.println(date); // 2014-01-29

        date = date.plusMonths(1);
        System.out.println(date); // 2014-02-28

        date = date.plusYears(5);
        System.out.println(date); // 2019-02-28

        // go backwards in time
        date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime); // 2020-01-20T05:15

        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2020-01-19T05:15

        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2020-01-18T19:15

        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2020-01-18T19:14:30


    }
}
