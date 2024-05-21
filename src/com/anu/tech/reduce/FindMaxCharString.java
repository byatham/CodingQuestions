package com.anu.tech.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> stringList = Arrays.asList("balaiah","Yatham", "Nagarkurnool");
		
		 
		Optional<String> reduce = stringList.stream().reduce((s1, s2)-> s1.length()>s2.length()?s1:s2);
		
		//System.out.println(reduce.get());
		
		
		
		String test="Hello balaiah how are you . you are from hyderbad";
		
		
	List<String> collect = Arrays.stream(test.split(" "))
				.collect(Collectors.groupingBy(s-> s, Collectors.counting()))
			    .entrySet().stream()
			    .filter(s-> s.getValue()>1)
			    .map(Map.Entry::getKey)
			    .collect(Collectors.toList());
						
		
		
		
		System.out.println(collect);
	}

}
