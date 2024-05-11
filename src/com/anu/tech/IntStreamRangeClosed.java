package com.anu.tech;

import java.util.stream.IntStream;

public class IntStreamRangeClosed {
	public static void main(String[] args) {
		// Create a range of integers, inclusive of both endpoints
		//this operation is processed by multiple threads.
		
		IntStream.rangeClosed(1, 99).parallel().filter(n -> String.valueOf(n).startsWith("1")).forEach(n -> {
			String name = Thread.currentThread().getName();

			System.out.println("Thread name " + name + " number " + n);

		});
	}
}
