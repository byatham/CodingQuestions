package com.anu.tech.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWithOne {

	public static void main(String[] args) {
		
		int[] numbers= {1,2,4,6,10,13,20};
		//find dumbers start with one
		
		//List<String> convertedArray = Arrays.stream(numbers).boxed().map(s->s+"").collect(Collectors.toList());
		
		List<String> numbersStartWithOne = Arrays.stream(numbers).boxed().map(s->s+"")
		.filter(s->s.startsWith("1"))
		.collect(Collectors.toList());
		
		System.out.println("After mapping "+numbersStartWithOne);

	}

}
