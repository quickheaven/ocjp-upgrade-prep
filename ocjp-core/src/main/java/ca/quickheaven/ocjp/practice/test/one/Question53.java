package ca.quickheaven.ocjp.practice.test.one;

import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question53 {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse("2017-01-01");
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        // What happens if the above method is compiled and run?
        // An exception is thrown at runtime at // 1
        // LocalDateTime.parse must represent a valid date-time.

    }
}
