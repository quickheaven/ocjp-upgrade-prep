package ca.quickheaven.ocjp.func.prog.ch04;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Implementing Predicate and BiPredicate. Predicate is often used when
 * filtering or matching. Both are very common operations. A BiPredicate is just
 * like a Predicate except that it takes two parameters instead of one.
 * 
 * @author frozencloud
 *
 */
public class PredicateImpl {

	public static void main(String[] args) {
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x -> x.isEmpty();

		// This prints true twice. More interesting is a BitPredicate. This example also
		// prints true twice.
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));

		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

		System.out.println(b1.test("chicken", "chick"));
		System.out.println(b2.test("chicken", "chick"));

		// Default methods on FunctionalInterface
		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");

		// Now we want a Predicate for brown eggs and another for all other colors of
		// eggs. We could write by hand:
		// This works, but its not great. Its a bit long to read and contains
		// duplication.
		Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
		Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

		// A better way to deal with this situation is to use two of the default methods
		// on Predicate
		brownEggs = egg.and(brown);
		otherEggs = egg.and(brown.negate());

	}

}
