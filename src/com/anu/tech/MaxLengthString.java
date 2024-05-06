package com.anu.tech;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxLengthString {

	public static void main(String[] args) {
		

		List<String> str = Arrays.asList("Hyderabad", "Chennai", "Hyderabad099999999", "Chennai", "Mumbai", "Bangalore12345");
		
		Optional<String> max = str.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println("max length is "+max.get());

	}

}
