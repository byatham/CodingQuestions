package com.anu.tech.functionalInterfaces;

import java.util.function.Function;

public class FunctionTest {
	    public static void main(String[] args) {
	        // Function to multiply by 2
	        Function<Integer, Integer> multiplyByTwo = (Integer x) -> x * 2;

	        // Function to add 3
	        Function<Integer, Integer> addThree = (Integer x) -> x + 3;

	        // Compose the functions: (x * 2) + 3
	        Function<Integer, Integer> combinedFunction = multiplyByTwo.andThen(addThree);

	        // Apply the composed function
	        Integer result = combinedFunction.apply(2);
	        System.out.println("Result of combined function: " + result);
	    }
	}
