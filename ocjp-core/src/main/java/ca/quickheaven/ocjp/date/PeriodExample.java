package ca.quickheaven.ocjp.date;

import java.time.*;

public class PeriodExample {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);

        performAnimalEnrichment(start, end);

        // There are five ways to create a Period class:
        Period annually = Period.ofYears(1);                            // every 1 year
        Period quarterly = Period.ofMonths(3);                          // every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3);                     // every 3 weeks
        Period everyOtherDay = Period.ofDays(2);                        // every 2 days
        Period everyYearAndThreeWeeks = Period.of(1, 0, 7);   // every year and 7 days

        // Period Format: P1Y2M3D
        // P - Period (mandatory)
        // 1Y - # years
        // 2M - # months
        // 3D - # days

        System.out.println(Period.ofMonths(3)); // P3M

        // There are no years, so that part is skipped.
        // It's OK to have more days than are in a month.
        // Also it is OK to have more months than are in a year. Java uses the measures provided for each.
        System.out.println(Period.of(0, 20, 47)); // P20M47D

        // This one outputs P21D. Remember that week isnot one of the units a Period stores. Therefore, a week is converted
        // into 7 days. Since we have 3 weeks, that's 21 days.
        System.out.println(Period.ofWeeks(3)); // P21D

        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period));      // 2015-02-20
        System.out.println(dateTime.plus(period));  // 2015-02-20T06:15

        // attempts to add a month to an object that has only a time
        System.out.println(time.plus(period));      // UnsupportedTemporalTypeException


    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }
}
