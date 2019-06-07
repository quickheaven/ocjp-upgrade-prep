package ca.quickheaven.ocjp.gencol.vo;

/**
 * Just like a class, an interface can declare a formal type parameter.
 */
public interface Shippable<T> {

	void ship(T t);

}
