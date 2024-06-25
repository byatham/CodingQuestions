package com.anu.tech.ds;

import java.util.ArrayList;
import java.util.List;

//2. ArrayList
//An ArrayList is a resizable array, which can grow as needed.
public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		System.out.println(fruits.get(0));//Apple
		
	}

}
