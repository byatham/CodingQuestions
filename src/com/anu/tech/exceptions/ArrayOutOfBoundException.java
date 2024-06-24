package com.anu.tech.exceptions;

import java.util.Arrays;
import java.util.List;

public class ArrayOutOfBoundException {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("abc","xyz","123");
		System.out.println(list.size());// size is 3 
		System.out.println(list.get(3));// it will give ArrayIndexOutOfBoundsException . Because array size is 3 and we are trying to call 4th element
		
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		at java.base/java.util.Arrays$ArrayList.get(Arrays.java:4165)
		at com.anu.tech.exceptions.ArrayOutOfBoundException.main(ArrayOutOfBoundException.java:10) */


	}

}
