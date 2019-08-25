package ca.quickheaven.ocjp.gencol.vo;

public class Crate<T> { // The generic type T is available anywhere within the Crate class. When you
						// instantiate the class, you tell the compiler what T should be for that
						// particular instance.

	private T contents;

	public T emptyCrate() {
		return contents;
	}

	public void packCreate(T contents) {
		this.contents = contents;
	}

}
