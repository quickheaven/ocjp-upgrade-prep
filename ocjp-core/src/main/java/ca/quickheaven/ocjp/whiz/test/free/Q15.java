package ca.quickheaven.ocjp.whiz.test.free;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q15 {

	public static void main(String[] args) {

		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(1);

		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

		ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();

	}
}
