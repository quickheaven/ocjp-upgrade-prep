package ca.quickheaven.ocjp.gencol;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bounds {

	public static void main(String[] args) {
		// Unbounded wildcard
		List<?> l1 = new ArrayList<String>();

		// Wildcard with an upper bound
		List<? extends Exception> l2 = new ArrayList<RuntimeException>();

		// Wildcard with a lower bound
		List<? super Exception> l3 = new ArrayList<Object>();

		unBoundedWildcards();

		upperBoundedWildcards();

		lowerBoundedWildcards();

		understandingGenericSuperTypes();

		puttingItAllTogether();

	}

	protected static void unBoundedWildcards() {
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		// printList1(keywords); // DOES NOT COMPILE
		printList2(keywords);
	}

	private static void printList1(List<Object> list) {
		for (Object x : list) {
			System.out.println(x);
		}
	}

	private static void printList2(List<?> list) {
		for (Object x : list) {
			System.out.println(x);
		}
	}

	protected static void upperBoundedWildcards() {
		// ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE
		List<? extends Number> list = new ArrayList<Integer>();
	}

	private static long total(List<? extends Number> list) {
		long count = 0;
		for (Number number : list) {
			count += number.longValue();
		}
		return count;
	}

	protected static void lowerBoundedWildcards() {
		List<String> strings = new ArrayList<String>();
		strings.add("tweet");

		List<Object> objects = new ArrayList<Object>(strings);
		addSound(strings);
		addSound(objects);
	}

	private static void addSound(List<? super String> list) {
		list.add("quack");
	}

	protected static void understandingGenericSuperTypes() {
		List<? super IOException> exceptions = new ArrayList<Exception>();
		// exceptions.add(new Exception()); // DOES NOT COMPILE
		exceptions.add(new IOException());
		exceptions.add(new IOException());
		// FileNotFoundException also happens to be an IOException, so everything is
		// fine
		exceptions.add(new FileNotFoundException());
	}

	protected static void puttingItAllTogether() {
		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 = new ArrayList<A>();
		
		// List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE
		List<? super B> list5 = new ArrayList<A>();
		
		// List<?> list 6 = new ArrayList<? extends A>(); // DOES NOT COMPILE
	}

}

class A {
}

class B extends A {
}

class C extends B {
}
