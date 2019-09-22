package ca.quickheaven.ocjp.practice.test.one;

public class Question49 {

    public static void main(String[] args) {
        // Which TWO of the following are valid interface definitions?

        /**
         * static method cannot override an instance method in a super interface.
         * an instance method is allowed to override a static method and a default method can override abstract method.
         * both static and default methods can be overridden by abstract methods in a sub-interfaces
         */
    }
}

interface ParentInterface {

    static boolean staticMethod() {
        return true;
    }

    default boolean defaultMethod() {
        return false;
    }

    void emptyMethod();
}

interface ChildInterface1 extends ParentInterface {

    default boolean staticMethod() {
        return false;
    }

    default boolean defaultMethod() {
        return true;
    }

    default void emptyMethod() {
        // do something
    }

}

interface ChildInterface2 extends ParentInterface {

    boolean staticMethod();

    boolean defaultMethod();

    default void emptyMethod() {
        // do something
    }


}
