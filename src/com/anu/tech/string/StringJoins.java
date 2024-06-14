package com.anu.tech.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringJoins {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date","apple");
		//System.out.println(String.join("***", strings));
		
		 
         
		String result = strings.stream().map(s-> s.toUpperCase())
		    .collect(Collectors.joining("_"));

		System.out.println(result); // Outputs: apple, banana, cherry, date
		
		Optional<String> maxCharString = strings.stream().reduce((s1,s2)->s1.length()>s2.length()?s1:s2);

       System.out.println(maxCharString.get());
       Map<String, Long> collect = strings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       
       collect.forEach((k,v)->System.out.println(k+"-"+v));
       System.out.println("*******************************");
       
       String name="apple";
       Map<String, Long> charCounting = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(charCounting);
       
       strings.stream().filter(s->Character.isDigit(s.charAt(0))).forEach(System.out::println);
	}

}
