package ca.quickheaven.ocjp.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Anytime you see a Lock object on the exam, make sure that it calls unlock()
 * the same number of times that it calls lock() .
 * 
 * @author frozencloud
 *
 */
public class DuplicatingLockRequest {

	public static void main(String[] args) {
		int birthCount = 0;
		
		Lock lock = new ReentrantLock();
		/* 
		 * this outputs Unavailable , since the lock is still maintained by the original thread.
		try {
			lock.lock();
			lock.lock();
		} finally {
			lock.unlock();
		}
		*/
		
		// We can address this problem by calling unlock() once for each lock() request
		try {
			lock.lock();
			try {
				lock.lock();
				++birthCount;
			} finally {
				lock.unlock();
			}
		} finally {
			lock.unlock();
		}

		new Thread(() -> {
			if (lock.tryLock()) {
				try {
					System.out.println("Acquired.");
				} finally {
					lock.unlock();
				}
			} else {
				System.out.println("Unavailable");
			}
		}).start();
	}

}
