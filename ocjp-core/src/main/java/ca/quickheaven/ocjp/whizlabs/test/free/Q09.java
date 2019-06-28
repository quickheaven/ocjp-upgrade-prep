package ca.quickheaven.ocjp.whizlabs.test.free;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q09 {

	// It prints Hello World
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);

		Future<String> asyncResult = threadPool.submit(new Callable<String>() {

			public String call() throws InterruptedException {
				Thread.sleep(1000);
				return "Hello World";
			}

		});

		while (!asyncResult.isDone()) {
			Thread.sleep(200);
		}

		System.out.println(asyncResult.get());
		threadPool.shutdown();
	}

}
