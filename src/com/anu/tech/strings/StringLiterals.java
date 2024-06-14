package com.anu.tech.strings;

public class StringLiterals {

	public static void main(String[] args) {
		System.out.println("*************************");
		
		String name="Balaiah";
		String finalname = name.concat("yatham");
		
		System.out.println(finalname);
		System.out.println(name.intern());
		
		String name1="Balaiah";
		System.out.println(name.intern());
		
		System.out.println(name==name1);
	

	}

}
