package ca.quickheaven.ocjp.whiz.test.free;

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

	// Exception in thread "main" Closing app 1
	// java.lang.RuntimeException
	// at ca.quickheaven.ocjp.whizlabs.test.free.Q03.<init>(Q03.java:12)
	// at ca.quickheaven.ocjp.whizlabs.test.free.Q03.main(Q03.java:21)

}
