package com.anu.tech.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/* Provides a high-level API for managing threads.
Simplifies the process of running tasks asynchronously. 
The java.util.concurrent package is powerful and provides the necessary tools to efficiently handle concurrency in Java applications.
 By utilizing these utilities, 
developers can create more reliable and maintainable multi-threaded programs.
*/

public class ExecutorsFrameworkTest {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<?> taskCompletionStatus = executor.submit(() ->

		{
			try {
				System.out.println("Task executed");
				int a=10/0;
			} catch (ArithmeticException | NullPointerException | NumberFormatException e) {
				System.out.println(" issues occured "+e.getMessage());

			}

		});
		
		try {
			System.out.println(taskCompletionStatus.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		executor.shutdown();
	}

}
