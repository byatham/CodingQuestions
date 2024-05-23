package com.anu.tech.concurrency;

import java.util.concurrent.CountDownLatch;

//Allows one or more threads to wait until a set of operations being performed in other threads completes.
public class CountDownLatchTest {

	public static void main(String[] args) throws InterruptedException {
		int threadCount = 3;
		CountDownLatch latch = new CountDownLatch(threadCount);

		for (int i = 0; i < threadCount; i++) {
		    new Thread(() -> {
		        try {
		            // perform some work
		        } finally {
		            latch.countDown();
		        }
		    }).start();
		    System.out.println(Thread.currentThread().getName());
		}

		latch.await(); // Main thread waits until latch counts down to zero


	}

}
