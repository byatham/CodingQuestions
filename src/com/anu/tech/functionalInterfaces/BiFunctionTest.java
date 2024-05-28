package com.anu.tech.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list1=Arrays.asList(1,2,3,40,50,60,70);
		
		List<Integer> list2=Arrays.asList(1,2,3,10,20,30,70);
		
		BiFunction<List<Integer>, List<Integer>,List<Integer>>  test=new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
			
			@Override
			public List<Integer> apply(List<Integer> t, List<Integer> u) {
				// TODO Auto-generated method stub
				 return Stream.of(list1,list2)
						 .flatMap(List::stream)
						 .distinct()
						 .collect(Collectors.toList());
			}
		};

       System.out.println("BiFunction test "+test.apply(list1, list2));
	}

}
