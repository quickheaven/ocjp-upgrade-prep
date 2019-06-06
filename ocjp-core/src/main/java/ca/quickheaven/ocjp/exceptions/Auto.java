package ca.quickheaven.ocjp.exceptions;

/**
 * Resources are closed in the reverse order from which they were created.
 * 
 * Result: Close: 2 Close: 1 ex finally
 * 
 * @author frozencloud
 *
 */
public class Auto implements AutoCloseable {
	int num;

	Auto(int num) {
		this.num = num;
	}

	public void close() {
		System.out.println("Close: " + num);
	}

	public static void main(String[] args) {
		try (Auto a1 = new Auto(1); Auto a2 = new Auto(2)) {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("ex");
		} finally {
			System.out.println("finally");
		}

	}

}
