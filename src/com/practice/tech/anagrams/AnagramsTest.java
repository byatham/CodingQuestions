package com.practice.tech.anagrams;

import java.util.Arrays;

public class AnagramsTest {
	
	public static  boolean isArgan(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		char[] s1CharArray = s1.toCharArray();
		char[] s2CharArray = s2.toCharArray();
		Arrays.sort(s1CharArray);
		Arrays.sort(s2CharArray);
		
		return Arrays.equals(s1CharArray, s2CharArray);
		
	}

	public static void main(String[] args) {
		
		System.out.println("********* anagrams test **************");

		System.out.println(isArgan("listen", "silent"));
		
		System.out.println(isArgan("peek", "keep"));
		System.out.println(isArgan("file", "life"));


		

	}

}
