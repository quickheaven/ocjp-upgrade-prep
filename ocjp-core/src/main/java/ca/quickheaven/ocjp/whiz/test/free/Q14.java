package ca.quickheaven.ocjp.whiz.test.free;

import java.io.IOException;

public class Q14 implements AutoCloseable {

	/* The main method print:
	 * Opening MyApp...
	 * I am an exception
	 * Closing MyApp...
	 * Exception caught
	 */
	public static void main(String[] args) {

		try (Q14 myApp = new Q14()) {
			myApp.open();
			myApp.read();
			myApp.close();
		} catch (IOException e) {
			System.out.println("Exception caught");
		}
	}

	public void open() {
		System.out.println("Opening MyApp...");
	}

	public void read() throws IOException {
		System.out.println("I am an exception");
		throw new IOException();
	}

	@Override
	public void close() {
		System.out.println("Closing MyApp...");

	}

}
