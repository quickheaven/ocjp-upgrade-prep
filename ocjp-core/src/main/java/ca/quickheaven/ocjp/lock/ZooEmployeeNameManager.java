package ca.quickheaven.ocjp.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ZooEmployeeNameManager {

	private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	private List<String> names = new ArrayList<>();

	public ZooEmployeeNameManager() {
		names.add("John Smith");
		names.add("Sara Smith");
		names.add("James Johnson");

	}

	private String readNames(int i) {
		Lock lock = readWriteLock.readLock();
		try {
			lock.lock();
			System.out.println("Read Lock Obtained!");
			return names.get(i % names.size());
		} finally {
			System.out.println("Read Lock Released!");
			lock.unlock();
		}
	}

	private void addName(String name) {
		Lock lock = readWriteLock.writeLock();
		
		// You can see that with this modification, the addName() method is no longer
		// mutually exclusive, as other threads were able to act on the data while the
		// addName() method was sleeping.
		// Lock lock = readWriteLock.readLock();
		try {
			lock.lock();
			System.out.println("Write Lock Obtained!");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// Handle thread interrupted exception
		} finally {
			System.out.println("Write Lock Released!");
		}
	}

	public static void main(String[] args) {
		ZooEmployeeNameManager manager = new ZooEmployeeNameManager();
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			for (int i = 0; i < 100; i++) {
				final int employeeNumber = i;
				service.submit(() -> manager.readNames(employeeNumber));
			}
			service.submit(() -> manager.addName("Grace Hopper"));
			service.submit(() -> manager.addName("Josephine Davis"));
		} finally {
			if (service != null) {
				service.shutdown();
			}
		}
	}

}
