package ca.quickheaven.ocjp.practice.test.two;

public class Question51 {

    public static void main(String[] args) {
        System.out.println(new ISedan() {
            @Override
            public String hello() {
                return "I am no one";
            }
        }.hello());
        // What happens when the class is compiled and run?
        // >> It prints out "I am no one"
    }
}

interface IVehicle {
    static String hello() {
        return "I am a Vehicle";
    }
}

interface ICar extends IVehicle {
    default String hello() {
        return "I am a Car";
    }
}

interface ISedan extends ICar {
    String hello();
}