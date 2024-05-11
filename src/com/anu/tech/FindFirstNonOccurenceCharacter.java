package com.anu.tech;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonOccurenceCharacter {
	    public static void main(String[] args) {
	        String str = "bbalaiah";
	        char firstNonRepeatingChar = findFirstNonRepeatingChar(str);
	        System.out.println("First non-repeating character: " + firstNonRepeatingChar);
	    }

	    public static char findFirstNonRepeatingChar(String str) {
	        Map<Character, Long> charCounts = str.chars()
	                .mapToObj(c -> (char) c)
	                .collect(LinkedHashMap<Character, Long>::new, (map, c) -> map.merge(c, 1L, Long::sum), LinkedHashMap<Character, Long>::putAll);

	        return charCounts.entrySet().stream()
	                .filter(entry -> entry.getValue() == 1)
	                .map(Map.Entry::getKey)
	                .findFirst()
	                .orElseThrow(() -> new RuntimeException("No non-repeating character found"));
	    }
	}

