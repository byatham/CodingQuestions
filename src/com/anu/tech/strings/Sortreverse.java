package com.anu.tech.strings;

import java.util.Arrays;
import java.util.Comparator;

public class Sortreverse {

	public static void main(String[] args) {
		
		String s="yatham";
		
		 // Convert the string to a Character array
        Character[] charArray = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }
        Arrays.stream(charArray).sorted(Comparator.reverseOrder()).forEach(System.out::print);
		
		

	}

}
