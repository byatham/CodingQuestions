package com.anu.tech.faqs;

import java.util.HashMap;
import java.util.Map;

public class EachCharactersCountWithoutStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "balaiah";// out put {a=3, b=1, h=1, i=1, l=1}
		char[] nameChar = name.toCharArray();
		Map<Character, Integer> countMap = new HashMap<>();
		for (char ch : nameChar) {
			if (!countMap.containsKey(ch)) {
				countMap.put(ch, 1);
			} else {
				int count = countMap.get(ch);
				countMap.put(ch, count + 1);
			}
		}
		System.out.println(countMap);

	}
}
