package ca.quickheaven.ocjp.whiz.test.free;

import java.util.function.BiFunction;

public class Q23 {

	public static void main(String[] args) {
		int number1 = 3;
		int number2 = 5;
		BiFunction<Integer, Integer, Integer> func = (int1, int2) -> int1 * int2;
		System.out.println(func.apply(number1, number2)); // 15
	}

}
