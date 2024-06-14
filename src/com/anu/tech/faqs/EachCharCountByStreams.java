package com.anu.tech.faqs;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class EachCharCountByStreams {

	public static void main(String[] args) {
		String str = "balaiah";
		// Count occurrences of each character
		Map<Character, Long> charCounts = str.chars() // IntStream
				.mapToObj(c -> (char) c) // Convert to Stream<Character>
				.filter(c -> String.valueOf(c).length() == 1)

				// .max(Character::compareTo)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())); // Count occurrences

		// Print the result
		charCounts.forEach((character, count) -> System.out.println(character + ": " + count));
		
		//another way
		
		Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(collect);
	}
}
