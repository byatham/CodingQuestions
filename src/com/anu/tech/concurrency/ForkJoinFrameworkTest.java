package com.anu.tech.concurrency;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* Designed for parallel computation where a task can be recursively split into smaller tasks.
Implements the divide-and-conquer algorithm. */

public class ForkJoinFrameworkTest {

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		RecursiveTask<Integer> task = new RecursiveTask() {

			@Override
			protected Integer compute() {
				// divide and conquer logic
				List<Integer> collect = IntStream.rangeClosed(1, 10000).boxed().filter(x-> x%2==0).collect(Collectors.toList());
				System.out.println(collect);
				return null;
			}
		};
		forkJoinPool.invoke(task);

	}

}
