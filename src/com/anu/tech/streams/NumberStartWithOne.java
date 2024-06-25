package com.anu.tech.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberStartWithOne {

	public static void main(String[] args) {
		
		int[] numbers= {1,2,4,6,10,13,20,10,13};
		//find numbers start with one
		
		//List<String> convertedArray = Arrays.stream(numbers).boxed().map(s->s+"").collect(Collectors.toList());
//		/List<String> numbersStartWithOne
		 Set<String> numbersStartWithOne = Arrays.stream(numbers).boxed().map(s->s+"")
		.filter(s->s.startsWith("1"))
		.collect(Collectors.toSet());
		
		System.out.println("After mapping "+numbersStartWithOne);

	}

}
