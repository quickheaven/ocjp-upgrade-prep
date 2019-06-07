package ca.quickheaven.ocjp.gencol;

public class GenericInterface {

	public static void main(String[] args) {
		// There are three ways a class can approach implementing this interface.
		// The first is to specify the generic type in the class. - ShippableRobotCrate
		// The next way is to create a generic class - ShippableAbstractCrate
		// The final way is to not use generics at all. This is the old way of writing
		// code - ShippableCrate
		// (It generates a compiler warning about Shippable being a raw type, but it
		// does compile.)
	}

}
