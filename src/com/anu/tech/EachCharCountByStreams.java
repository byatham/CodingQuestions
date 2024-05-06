package com.anu.tech;

import java.util.Map;
import java.util.stream.Collectors;

public class EachCharCountByStreams {

	public static void main(String[] args) {
		        String str = "balaiah";
		        //notes to check whether it is a vowel or not .. if vowel then count
		        
		        // Count occurrences of each character
		        Map<Character, Long> charCounts = str.chars() // IntStream
		                .mapToObj(c -> (char) c) // Convert to Stream<Character>
		                .filter(c-> String.valueOf(c).toString().matches(".*[aeiou].*"))
		                //.max(Character::compareTo)
		                .collect(Collectors.groupingBy(c -> c, Collectors.counting())); // Count occurrences
		        
		   
		        
		        // Print the result
		        charCounts.forEach((character, count) -> System.out.println(character + ": " + count));
		    }
		}
