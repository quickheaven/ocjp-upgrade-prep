package ca.quickheaven.ocjp.practice.test.free;

public interface Question22<E> {

	// What is a valid functional interface declaration?

	E getSometing();

	// functional interface is an interface with exactly one abstract method
	default void setSometing(E e) {
	}

}
