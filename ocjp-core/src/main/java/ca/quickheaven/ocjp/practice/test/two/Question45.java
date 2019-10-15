package ca.quickheaven.ocjp.practice.test.two;

import ca.quickheaven.ocjp.practice.test.vo.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Question45 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(1, "Alex"), new Student(2, "Max"));
        // insert here
        // What should be placed at insert here to make the given fragment run and print out "[ALEX, MAX]"?
        UnaryOperator<Student> function = s -> new Student(s.getId(), s.getName().toUpperCase());

        students.replaceAll(function);
        System.out.println(students);
    }
}
