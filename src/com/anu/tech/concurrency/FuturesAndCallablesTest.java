package com.anu.tech.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* Callable is similar to Runnable but can return a result and throw a checked exception.
Future represents the result of an asynchronous computation. */

public class FuturesAndCallablesTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<Integer> future = executor.submit(() -> {
		    return 1 + 1+1;
		});
		Integer result = future.get();
		System.out.println("result "+result);
		executor.shutdown();


	}

}
