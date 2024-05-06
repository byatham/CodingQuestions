package com.anu.tech;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        List<Integer> numbers = Arrays.asList(5, 2, 8, 10, 3, 1);
	        
	        // Sort the list in descending order
	        numbers.sort((a, b) -> b - a);
	        
	        // Second maximum element will be at index 1
	        int secondMax = numbers.get(0);
	        
	        System.out.println("Second maximum element: " + secondMax);
	        
	        Optional<Integer> secondMax1 = numbers.stream()
	                .sorted(Comparator.reverseOrder()) // Sort in descending order
	                .skip(1) // Skip the first element, which is the maximum
	                .findFirst(); // Get the second maximum if it exists
	        
	        System.out.println(" second max number "+secondMax1.get());
	       
	    }

	}

