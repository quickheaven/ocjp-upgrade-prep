package ca.quickheaven.ocjp.whizlabs.test.free;

import java.io.IOException;

public class Q03 implements AutoCloseable {

	private int id;

	public Q03(int id) {
		this.id = id;
		if (id > 1) {
			throw new RuntimeException();
		}
	}

	public void close() throws IOException {
		System.out.println("Closing app " + id);
	}

	public static void main(String[] args) throws Exception {
		try (Q03 a = new Q03(1); Q03 b = new Q03(2)) {
			System.out.println("My App");
		}
	}

}
