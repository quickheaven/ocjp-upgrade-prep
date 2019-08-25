package ca.quickheaven.ocjp.whiz.test.free;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q12 {

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 5);
		// 1,2,3,4

		Stream<Integer> numbers = stream.boxed();
		Object object = numbers.collect(Collectors.partitioningBy(x -> x * 4 > 10));
		// 1 * 4 = 4 > 10 = false
		// 2 * 4 = 8 > 10 = false
		// 3 * 4 = 12 > 10 = true
		// 4 * 4 = 16 > 10 = true

		System.out.println(object);
		// {false=[1, 2], true={3, 4}}
	}

}
