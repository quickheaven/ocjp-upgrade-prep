package ca.quickheaven.ocjp.practice.test.one;

import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question59 {

    public static void main(String[] args) {
        // It prints out today's date with time information being truncated
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDateTime.now()));
    }
}
