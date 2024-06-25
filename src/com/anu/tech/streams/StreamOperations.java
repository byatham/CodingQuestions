package com.anu.tech.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("balaiah", "nagaiah", "balaiah", "ramaiah", "Jaganmohanreddy");
		// count of repeated elements
		Map<String, Long> collect3 = list.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		System.out.println(collect3);

		// finding longest element
		Optional<String> reduce = list.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2);

		System.out.println("longest string " + reduce.get());

		// removing duplicates
		list.stream().distinct().forEach(System.out::println);
		System.out.println("^*^*^*&^");

		// finding duplicates by using frequency method
		Set<String> collect = list.stream().filter(s -> Collections.frequency(list, s) >= 1)
				.collect(Collectors.toSet());
		System.out.println(collect);

	}

}
