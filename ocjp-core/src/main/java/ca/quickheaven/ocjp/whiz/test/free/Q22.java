package ca.quickheaven.ocjp.whiz.test.free;

public interface Q22<E> {

	E getSometing();

	// functional interface is an interface with exactly one abstract method
	default void setSometing(E e) {
	}

}
