package ca.quickheaven.ocjp.gencol;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassesNAutoboxing {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(new Integer(3));
		numbers.add(new Integer(5));
		System.out.println(numbers); // [1, 3, 5]

		// The remove() method is overloaded. One signature takes an int as the index of
		// the element to remove. The other takes an Object that should be removed.

		// Java sees a matching signature for int, so it doesn’t need to autobox the
		// call to the method
		numbers.remove(1);
		System.out.println(numbers); // [1, 5]

		// calls the other remove() method, and it removes the matching object, which
		// leaves us with just [1].
		numbers.remove(new Integer(5));
		System.out.println(numbers); // [1]
	}

}
