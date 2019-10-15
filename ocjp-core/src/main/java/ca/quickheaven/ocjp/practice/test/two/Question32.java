package ca.quickheaven.ocjp.practice.test.two;

import ca.quickheaven.ocjp.practice.test.vo.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question32 {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Alex");
        Student student2 = new Student(2, "Jack");
        Student student3 = new Student(3, "Douglas");
        Student student4 = new Student(4, "Jill");

        Map<Integer, Student> map1 = new HashMap<>();
        map1.put(student1.getId(), student1);
        map1.put(student2.getId(), student2);

        Map<Integer, Student> map2 = new HashMap<>();
        map1.put(student3.getId(), student3);
        map1.put(student4.getId(), student4);

        List<Map<Integer, Student>> students = Arrays.asList(map1, map2);

        students.stream().flatMap(s -> s.values().stream()) // 1
                .filter(s -> s.getName().startsWith("J")) // 2
                .forEach(System.out::println);

        // What happens when the provided code snippet is compiled and executed?
        // >> It prints out "2" and "4"
        // As the method toString of Student returns string representation of the id field, the text value gets printed
        // is "2" and "4".

    }
}
