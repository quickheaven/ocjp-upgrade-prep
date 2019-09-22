package ca.quickheaven.ocjp.practice.test.one;

import java.time.Duration;
import java.time.Period;

public class Question60 {

    public static void main(String[] args) {
        Period period = Period.ofDays(30); // 1
        Duration duration = Duration.ofDays(30); // 2
        System.out.println(period + " " + duration); // P30D PT720H
    }
}
