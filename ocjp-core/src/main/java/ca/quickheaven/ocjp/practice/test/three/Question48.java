package ca.quickheaven.ocjp.practice.test.three;

public class Question48 {
}

interface Animal {
    default double getWeight() {
        return 0.0;
    }

    static double getLength() {
        return 0.0;
    }
}

interface Mammal extends Animal {
    String getColor();
}

abstract class Lion implements Mammal {

    // abstract public String getColor(); abstract double getWeight(); // getWeight method cannot reduce the visibility of the overriden method

    // abstract  public String getColor(); abstract double getLength(); // OK

    // public double getWeight() { return 35.0; } public double getLength() { return 7.5; } // OK

    // public static double getWeight() { return 35.0; } public static double getLength() { return 7.5; }  // getWeight static method cannot override an instance method

    // public default getWeight() { return 350.0} public default double getLength() { return 7.5; } // default method can only be used with the method defined in an interface, not in a class
}
