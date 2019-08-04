package ca.quickheaven.ocjp.func.prog.ch04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * A Supplier is used when you want to generate or supply values without taking
 * any input.
 * 
 * @author frozencloud
 *
 */
public class SupplierImpl {

	public static void main(String[] args) {
		Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = LocalDate::now;

		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();

		System.out.println(d1);
		System.out.println(d2);

		// A Supplier is often used when constructing new objects
		Supplier<StringBuilder> sb1 = StringBuilder::new;
        Supplier<StringBuilder> sb2 = StringBuilder::new;

		System.out.println(sb1);
		System.out.println(sb2);

        Supplier<ArrayList<String>> t1 = ArrayList::new;
		ArrayList<String> a1 = t1.get(); // calling get() creates a new instnace of ArrayList<String>
		System.out.println(a1);


    }

}
