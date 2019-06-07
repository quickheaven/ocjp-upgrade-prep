package ca.quickheaven.ocjp.gencol;

/**
 * Just like a class, an interface can declare a formal type parameter.
 */
public interface Shippable<T> {

	void ship(T t);

}
