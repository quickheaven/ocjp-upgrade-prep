package ca.quickheaven.ocjp.practice.test.one;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Question51 {

    public static void main(String[] args) {
        // Which TWO of the following statements correctly print out Tuesday next after the first Monday in the
        // month of November of this year?

        // TODO
        System.out.println(LocalDate.now().withMonth(11).withDayOfMonth(1).with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));

        System.out.println(LocalDate.now().withMonth(11).withDayOfMonth(1).with(TemporalAdjusters.next(DayOfWeek.MONDAY)).plusDays(1));

        System.out.println(LocalDate.now().withMonth(11).with(TemporalAdjusters.firstDayOfMonth()).with(TemporalAdjusters.next(DayOfWeek.MONDAY)).plusDays(1));

        System.out.println(TemporalAdjusters.next(DayOfWeek.TUESDAY).adjustInto(LocalDate.now().withMonth(11).with(TemporalAdjusters.firstDayOfMonth())));

    }
}
