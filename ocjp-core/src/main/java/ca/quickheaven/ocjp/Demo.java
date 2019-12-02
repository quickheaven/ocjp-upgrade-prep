package ca.quickheaven.ocjp;

interface Parent {

    void instanceMethod();

    static void staticMethod() {
    }

    default void defaultMethod() {
    }
}

interface Child extends Parent {

    void instanceMethod();

    static void staticMethod() {
    }

    default void defaultMethod() {
    }

}

public abstract class Demo implements Child {

    public abstract void instanceMethod();

    public abstract void staticMethod();

    public abstract void defaultMethod();
}
