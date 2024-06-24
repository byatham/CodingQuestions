package com.anu.tech.factors;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FindFactors {

	public static  Integer  findFactors(int number)
	{
		int factoredNumber = IntStream.rangeClosed(1, number).reduce(1, (a,b)->a*b);
		
		return factoredNumber;
		
	}
	
	
	public static void main(String[] args) {
		/*
		 * System.out.println("Finding Factors ******* ");
		 * System.out.println("Please enter your number to find factors : "); Scanner
		 * scanner=new Scanner(System.in); int number = scanner.nextInt();
		 */
		int number=5; //expected output 120   calculation :  1*2*3*4*5
		Integer result = findFactors(number);
		System.out.println("Given number is :"+number+"Factors of  number "+result);
		
	}
}
