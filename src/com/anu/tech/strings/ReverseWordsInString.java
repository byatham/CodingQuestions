package com.anu.tech.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String name="Yatham Balaiah B.Tech"; // expected output [B.Tech, Balaiah, Yatham]
		String[] nameArray = name.split(" ");
		List<String> asList = Arrays.asList(nameArray);
		
		Collections.reverse(asList);
		System.out.println(asList);
		
	}

}
