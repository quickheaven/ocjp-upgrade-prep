package ca.quickheaven.ocjp.quiz.free;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

	Integer l;

	public static void main(String args[]) {
		// NumberFormat Fin2 Fin1 followed by uncaught exception
		/*
		String s;
		try {
			s = new Practice().l.toString();
		} finally {
			try {

			} catch (NumberFormatException E) {
				System.out.println("NumberFormat");
			} finally {
				System.out.println("Fin2");
			}
			System.out.println("Fin1");
		}
		*/

		// [One, Two, null]
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");

		map.replace(1, "1", null);
		map.replace(3, null);

		System.out.println(map.values());
		
		// [3] because it used toSet()
		Stream<String> stream = Stream.of("Cat", "Dog", "Rat");
		Stream<Integer> list = stream.flatMap(s -> Stream.of(s.length()));
		System.out.println(list.collect(Collectors.toSet())); 

	}

}
