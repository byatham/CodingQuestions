package com.anu.tech.concurrency;

import java.util.concurrent.CountDownLatch;

/* Utilities that help coordinate the control flow of threads.
Examples include CountDownLatch, Semaphore, CyclicBarrier, and Exchanger. */

public class SynchronizersTest {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		Runnable task = () -> {
		    // perform some work
		    latch.countDown();
		};
		new Thread(task).start();
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("********** ");


	}

}
