package com.anu.tech.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class MultiThreadingByJava8CompletableFuture  {
	
	public static void main(String[] args) {
		
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		
		IntStream.rangeClosed(1, 10)
		.forEach(num-> {
			
			CompletableFuture<Integer> evenCompletedFuture = CompletableFuture.completedFuture(num)
			.thenApplyAsync(x-> {
				
				if(x%2==0)
				{
					System.out.println("Thread Name "+Thread.currentThread().getName()+" value "+x);
				}
				return num;
			},executorService);
			evenCompletedFuture.join();
			CompletableFuture<Integer> oddCompletedFuture = CompletableFuture.completedFuture(num)
					.thenApplyAsync(x-> {
						
						if(x%2!=0)
						{
							System.out.println("Thread Name "+Thread.currentThread().getName()+" value "+x);
						}
						return num;
					},executorService);
			oddCompletedFuture.join();
		});
	}
	
	

}
