package ca.quickheaven.ocjp.practice.test.two;

public class Question48 {
}

// Which TWO of the following code fragments are valid?
// -- A
interface FatherA {
    static void method() {
    }
}

interface MotherA {
    default void method() {
    }
}

interface ChildA extends FatherA, MotherA {
    /*
     * cannot override instance method
    static void method() {
    }
     */
}

// -- B
interface FatherB {
    default void method() {
    }
}

interface MotherB {
    default void method() {
    }
}
/*
 * inherits unrelated default method
interface ChildB extends FatherB, MotherB {
}
 */

// -- C
interface FatherC {
    static void method() {
    }
}

interface MotherC {
    static void method() {
    }
}

interface ChildC extends FatherC, MotherC {
}

// -- D
interface FatherD {
    static void method() {
    }
}

interface MotherD {
    default void method() {
    }
}

interface ChildD extends FatherD, MotherD {
    void method();
}