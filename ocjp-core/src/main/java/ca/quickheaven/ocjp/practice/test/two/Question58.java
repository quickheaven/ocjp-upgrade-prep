package ca.quickheaven.ocjp.practice.test.two;

import java.time.Duration;

public class Question58 {

    public static void main(String[] args) {
        Duration seconds = Duration.ofSeconds(90061);
        Duration millis = Duration.ofMillis(1001);
        System.out.println(seconds); // PT25H1M1S
        System.out.println(millis);  // PT1.001S
    }
}
