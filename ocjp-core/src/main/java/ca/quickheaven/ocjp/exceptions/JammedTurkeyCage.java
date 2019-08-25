package ca.quickheaven.ocjp.exceptions;

public class JammedTurkeyCage implements AutoCloseable {

	public void close() throws IllegalStateException {
		//throw new IllegalStateException("Cage door does not close");
		throw new RuntimeException("turkeys ran off");
	}

	public static void main(String[] args) {
		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			System.out.println("put turkeys in");
		} catch (IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
		}
	}

}
