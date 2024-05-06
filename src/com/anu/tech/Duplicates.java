package com.anu.tech;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {
		/*
		 * List<Integer> num=new ArrayList<>(); num.add(1); num.add(3); num.add(4);
		 * num.add(2); num.add(2);
		 */
		
		int[] numbers= {1,3,4,2,2,5,5,5};
		List<int[]> asList = Arrays.asList(numbers);
		Set<int[]> collect2 = asList.stream().filter(n-> Collections.frequency(asList, n)>=1).collect(Collectors.toSet());
		System.out.println(collect2.toString());
		//asList.stream().filter(n-> Collections.frequency(asList, n)<=1).forEach(System.out::println);
		
		/*
		 * Set<Integer> collect = asList.stream().filter(n->
		 * Collections.frequency(objectArray,n)>1).collect(Collectors.toSet());
		 * System.out.println(collect);
		 */
	    
		
		/*
		 * // Example array String[] array = {"apple", "banana", "orange", "grape",
		 * "kiwi"}; Arrays.stream(array).filter(n-> Collections.frequency(array,
		 * n)>1).forEach(null); // Convert array to stream Stream<String> stream =
		 * Arrays.stream(array);
		 * 
		 * // Do something with the stream stream.forEach(System.out::println);
		 * 
		 * 
		 * IntStream stream2 = Arrays.stream(numbers); stream2.filter(n->
		 * Collections.frequency(collect2, n)>=1).forEach(System.out::println);
		 */

	}

}
