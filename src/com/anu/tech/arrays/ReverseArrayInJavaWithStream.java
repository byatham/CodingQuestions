package com.anu.tech.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseArrayInJavaWithStream {

	public static void main(String[] args) {

		int[] list = { 10,40, 20, 30, 50, 90 };// out put 10, 20
		Arrays.stream(list).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("************************************");
		Arrays.stream(list).boxed().sorted().forEach(System.out::println);

		
	}

}
