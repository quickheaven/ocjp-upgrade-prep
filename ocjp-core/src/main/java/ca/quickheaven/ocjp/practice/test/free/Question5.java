package ca.quickheaven.ocjp.practice.test.free;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Question5 {

    public static void main(String[] args) {
        // What is printed out after executing the following code fragment?
        Period period = Period.of(1, 2, 3);
        Duration duration = Duration.of(1000, ChronoUnit.SECONDS);
        System.out.println(period + " " + duration); // P1Y2M3D PT2H46M40S
    }

}
