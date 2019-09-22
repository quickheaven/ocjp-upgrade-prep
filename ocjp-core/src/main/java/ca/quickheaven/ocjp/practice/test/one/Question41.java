package ca.quickheaven.ocjp.practice.test.one;

public class Question41 {

    public static void main(String[] args) {
        // Which of these interfaces can be used as a lambda expression?
        // > GrandChild
        // In order to be used as lambda expression, an interface must be a functional interface meaning that it has
        // one and only one abstract method
    }
}

interface GrandParent {
    default void grandMethod() {
    }
}

interface Parent extends GrandParent {
    static void parentMethod() {
    }
}

interface Me extends Parent {
    void method();

    void grandMethod();
}

interface Child extends Me {
    void childMethod();
}

interface GrandChild extends Child {
    default void grandMethod() {
    }

    default void parentMethod() {
    }

    default void method() {
    }
}
