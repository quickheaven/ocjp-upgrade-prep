package ca.quickheaven.ocjp.practice.test.three;

public class Question45 {

    public static void main(String[] args) {
        Child func = () -> {
            System.out.println("I am a number");
            // return 0.0;
            return 0;
        };
    }
}

interface Parent {
    int method1();

    double method2();
}

interface Child extends Parent {
    default double method2() {
        return 0.0;
    }
}