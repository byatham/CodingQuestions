package com.anu.tech.faqs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxRepeatedWordInMap {
	public static void main(String[] args) {

		// on numbers

		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 2, 4, 2, 2, 2, 2, 5, 4, 5, 6, 7, 1, 1);

		Optional<Entry<Integer, Long>> max2 = numbers.stream()
				.collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue());

		System.out.println("max repeated number in from list " + max2);

		// on strings

		String text = "balaiah hyderabad telangana hyderabad yatham telangana balaiah hyderabad";

		Optional<Entry<String, Long>> mostRepeatedString = Arrays.stream(text.split(" "))
				.collect(Collectors.groupingBy(word -> word, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue());

		System.out.println("mostRepeatedString " + mostRepeatedString.get());

	}
}
