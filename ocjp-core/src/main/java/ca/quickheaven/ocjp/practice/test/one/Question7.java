package ca.quickheaven.ocjp.practice.test.one;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

    public static void main(String[] args) {
        // Which of the provided statements does NOT lead to a compiler error?
        List<? super Number> list1 = new ArrayList<>();     // 1 tell the compiler that the type of list1 is anything from Number up to Object in the inheritance hierarchy.
        List<? extends Number> list2 = new ArrayList<>();   // 2 informs the compiler of the element type, which is Number of any of its subtypes.
        list1.add(1); // 3
        /*
        list2.add(1);               // 4 compilation error. Integer may not be assigned to a some subtypes of Number, such as Double or Float. Likewise, line // 6
        int num1 = list1.get(0);    // 5 fails as there is no way the compiler can tell wether an element of type Number or Object can be assigned to a variable of type int
        int num2 = list2.get(0);    // 6
        */
    }
}
