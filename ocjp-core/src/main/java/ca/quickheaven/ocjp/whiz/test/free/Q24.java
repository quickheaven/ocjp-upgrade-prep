package ca.quickheaven.ocjp.whiz.test.free;

import java.util.Arrays;

public class Q24 {

	public static void main(String[] args) {
		Arrays.asList(1, 2, 3).stream().peek(System.out::print).allMatch(number -> number < 2); // 12
	}

}
