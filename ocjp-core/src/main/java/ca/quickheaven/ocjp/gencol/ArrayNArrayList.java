package ca.quickheaven.ocjp.gencol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayNArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Fluffy");
		list.add("Webby");

		String[] array = new String[list.size()];

		array[0] = list.get(1);
		array[1] = list.get(0);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "-");
		}

		String[] array2 = { "gerbil", "mouse" }; // [gerbil, mouse]
		List<String> list2 = Arrays.asList(array); // returns fixed size list
		list2.set(1, "test"); // [gerbil, test]
		array2[0] = "new"; // [new, test]
		
		String[] array3 = (String[]) list.toArray(); // [new, test]

	}

}
