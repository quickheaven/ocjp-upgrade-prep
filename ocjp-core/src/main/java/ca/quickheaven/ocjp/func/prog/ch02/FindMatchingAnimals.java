package ca.quickheaven.ocjp.func.prog.ch02;

import java.util.function.Predicate;

public class FindMatchingAnimals {

	private static void print(Animal animal, CheckTrait trait) {
		// Check trait have a method .test(Animal)
		if (trait.test(animal)) {
			System.out.println(animal);
		}
	}
	
	// Applying predicate interface
	// We can use Predicate in order to prevent creating multiple interface in order to use Lambda 
	private static void printP(Animal animal, Predicate<Animal> trait) {
		if (trait.test(animal)) {
			System.out.println(animal);
		}
	}

	public static void main(String[] args) {
		
		// Understanding Lambda sytanx:
		
		// Lambda syntax, including optional parts
		// parameter name + arrow + body
		// paranthesis can be omitted only if there is a exactly one parameter and the
		// data type is not specified.
		print(new Animal("fish", false, true), (Animal a) -> {
			return a.canHop(); // ";" is required because in the block
		});
		print(new Animal("kangaroo", true, false), (Animal a) -> {
			return a.canHop();
		});

		// Lambda syntax, omitting optional parts
		// parameter name + arrow + body
		// a -> a.canHop()
		print(new Animal("fish", false, true), a -> a.canHop());
		print(new Animal("kangaroo", true, false), a -> a.canHop());

		print(new Animal("fish", false, true), Animal::canHop);
		print(new Animal("kangaroo", true, false), Animal::canHop);
		
		
		// Applying predicate interface		
		printP(new Animal("fish", false, true), Animal::canHop);
		printP(new Animal("kangaroo", true, false), Animal::canHop);
		
	}

}
