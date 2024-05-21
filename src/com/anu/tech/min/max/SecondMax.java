package com.anu.tech.min.max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(5, 2, 8, 10, 3, 1);

		Optional<Integer> secondMax1 = numbers.stream().sorted(Comparator.reverseOrder()) // Sort in descending order
				.skip(1) // Skip the first element, which is the maximum
				.findFirst(); // Get the second maximum if it exists

		System.out.println(" second max number " + secondMax1.get());

	}

}
