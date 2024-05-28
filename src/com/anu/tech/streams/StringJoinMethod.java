package com.anu.tech.streams;

import java.util.Arrays;
import java.util.List;

public class StringJoinMethod {
	
	public static void main(String[] args) {
		
		List<String> nos=Arrays.asList("1","2","3","4","5");
		String afterJoin = String.join("-", nos);
		System.out.println(afterJoin);
		
	}

	
	
}
