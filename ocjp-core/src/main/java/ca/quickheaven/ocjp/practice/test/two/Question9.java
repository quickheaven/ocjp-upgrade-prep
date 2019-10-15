package ca.quickheaven.ocjp.practice.test.two;

import ca.quickheaven.ocjp.practice.test.vo.Car;
import ca.quickheaven.ocjp.practice.test.vo.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Question9 {

    public static void main(String[] args) {
        List<? extends Vehicle> list1 = new ArrayList<>();
        List<? super Car> list2 = new ArrayList<>();
        // list1.add(new Car()); // 1 Compilation fails
        // list2.add(new Vehicle()); // 2 Compilation fails
    }
}
