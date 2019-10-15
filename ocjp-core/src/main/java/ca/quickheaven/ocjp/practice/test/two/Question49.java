package ca.quickheaven.ocjp.practice.test.two;

import java.io.IOException;

public class Question49 {

    public static void main(String[] args) {
        try {
            // do something
            throw new IOException();
        } catch (IOException | RuntimeException e) { // 1
            // e = new RuntimeException(); // 2
            e.printStackTrace();
        }
        // What happens when the above code is compiled?
        // >> Compilation fails at line // 2, not line 1.
        // If a catch block handles more than one exception type, then the catch parameter is implicitly final.
    }
}
