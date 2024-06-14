package com.anu.tech.streams;

import java.util.Arrays;
import java.util.List;

public class MapAndFilterTest {

	public static void main(String[] args) {
		
		//from below given list convert to upper case and filter to print with text India
		//HCL 
		
		List<String> list=Arrays.asList("india","australia","uk");
		
		//ANS
		
		//list.stream().map(s->s.toUpperCase()).filter(s->s.equals("india")).forEach(System.out::println); // wrong answer. no output will come
		//list.stream().filter(s->s.equals("INDIA")).map(s->s.toUpperCase()).forEach(System.out::println); // wrong answer . no output will come
		
		list.stream().map(s->s.toUpperCase()).filter(s->s.equals("INDIA")).forEach(System.out::println); // right am
		System.out.println("**************************");
		
		


		

	}

}
