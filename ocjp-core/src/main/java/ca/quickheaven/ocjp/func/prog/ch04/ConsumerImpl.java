package ca.quickheaven.ocjp.func.prog.ch04;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Implementing Consumer and BiConsumer. You use Consumer and BiConsumer when
 * you want to do something with a parameter but not return anything. BiConsumer
 * does the same exact thing except that it takes two parameters.
 * 
 * @author frozencloud
 *
 */
public class ConsumerImpl {

	public static void main(String[] args) {

		Consumer<String> c1 = System.out::println; // Java uses the context of the lambda to determine which overload
													// println() method it should call.
		Consumer<String> c2 = x -> System.out.println(x);

		c1.accept("Annie1");
		c2.accept("Annie2");

		// BiConsumer is called with two parameters. They dont have to be the same type.
		Map<String, Integer> map1 = new HashMap<>();
		BiConsumer<String, Integer> b1 = map1::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map1.put(k, v);

		b1.accept("chicken", 7);
		b1.accept("chick", 1);

		System.out.println(map1); // {chicken=7, chick=7}

		// another example, we use the same type for both generic parameters
		Map<String, String> map2 = new HashMap<>();
		BiConsumer<String, String> bc1 = map2::put;
		BiConsumer<String, String> bc2 = (k, v) -> map2.put(k, v);

		bc1.accept("chicken", "Cluck");
		bc2.accept("chick", "Tweep");

		System.out.println(map2); // {chicken=Cluck, chick=Tweep}

	}

}
