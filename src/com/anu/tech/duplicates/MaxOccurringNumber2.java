package com.anu.tech.duplicates;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxOccurringNumber2 {

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 4, 4, 4, 4 };

		Map<Integer, Long> collect = Arrays.stream(numbers).boxed()
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));

		System.out.println(collect);

	}
}
