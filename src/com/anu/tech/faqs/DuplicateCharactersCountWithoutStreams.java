package com.anu.tech.faqs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersCountWithoutStreams {

	public static void main(String[] args) {
		// count only duplicated chars
		String name = "balaiah";
		char[] nameChar = name.toCharArray();
		Map<Character, Integer> countMap = new HashMap<>();
		for (int i = 0; i < nameChar.length; i++) {
			
			for (int j = i + 1; j < nameChar.length; j++) {
				if (nameChar[i] == nameChar[j]) {

					if (!countMap.containsKey(nameChar[i])) {
						countMap.put(nameChar[i], 1);
					} else {
						int count = countMap.get(nameChar[i]);
						countMap.put(nameChar[i], count + 1);
					}
				}
			}
		}
		System.out.println(countMap);

	}
}
