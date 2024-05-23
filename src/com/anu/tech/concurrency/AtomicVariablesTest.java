package com.anu.tech.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/* Support lock-free thread-safe programming on single variables.
Examples include AtomicInteger, AtomicLong, AtomicReference, etc */

public class AtomicVariablesTest {

	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(0);
		int oldValue = atomicInteger.getAndIncrement();
		System.out.println("oldValue "+oldValue);


	}

}
