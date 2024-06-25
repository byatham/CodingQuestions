package com.anu.tech.strings;

import java.util.Arrays;

public class AnagramsTest {
	
	public static boolean anagramsCheck(String s1, String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		

		char[] s11 = s1.toCharArray();
		char[] s22 = s2.toCharArray();
              Arrays.sort(s11);
              Arrays.sort(s22);
              return Arrays.equals(s11, s22);
	}

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";   
        System.out.println(anagramsCheck(s1, s2));
                  

	}

}
