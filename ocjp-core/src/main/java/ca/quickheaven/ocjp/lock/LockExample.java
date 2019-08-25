package ca.quickheaven.ocjp.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

	public static void main(String[] args) {
		// This code skips the lock-acquisition step and attempts to release a lock that
		// it does not have, which results in an IllegalMonitorStateException at
		// runtime.
		try {
			Lock lock = new ReentrantLock();
			lock.unlock();
		} catch (IllegalMonitorStateException e) {
			e.printStackTrace();
		}

		int birdCount = 0;
		Lock lock1 = new ReentrantLock();
		lock1.lock();
		if (lock1.tryLock()) {
			try {
				lock1.unlock();
			} finally {
				System.out.print(" " + (++birdCount));
			}
		} else {
			System.out.println("Unable to acquire lock, doing something else");
		}

		// The Lock interface includes an overloaded version of tryLock() and waits up
		// to a specified amount of time trying to acquire a lock. It returns true as
		// soon as the lock is acquired within the time specified, and it returns false
		// after the time elapses.
		try {
			birdCount = 0;
			Lock lock2 = new ReentrantLock();
			lock2.lock();
			if (lock2.tryLock(10, TimeUnit.SECONDS)) {
				try {
					lock2.unlock();
				} finally {
					System.out.print(" " + (++birdCount));
				}
			} else {
				System.out.println("Unable to acquire lock, doing something else");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
