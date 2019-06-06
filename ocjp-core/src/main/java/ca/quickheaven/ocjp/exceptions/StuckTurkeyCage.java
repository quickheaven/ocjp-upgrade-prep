package com.quickheaven.ocjp.exceptions;

public class StuckTurkeyCage implements AutoCloseable {

	@Override
	public void close() throws Exception {
		throw new Exception("Cage door does not close");

	}

	public static void main(String[] args) throws Exception { // And you know that checked exceptions need to be handled or declared.
		try (StuckTurkeyCage t = new StuckTurkeyCage()) {
			System.out.println("put turkeys in");
		}

	}

}
