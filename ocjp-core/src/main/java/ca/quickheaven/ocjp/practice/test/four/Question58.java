package ca.quickheaven.ocjp.practice.test.four;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question58 {

    public static void main(String[] args) {
        LocalDate ldt = LocalDate.of(2000, 3, 1);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/M/yyyy");

        // What is the output?
        // >> 01/3/2000 (watchout of the months)
        System.out.println(ldt.format(format));

    }
}
