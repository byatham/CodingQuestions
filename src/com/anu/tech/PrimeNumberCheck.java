package com.anu.tech;

//Write a Java program to check if the given number is a prime number.

public class PrimeNumberCheck {

	public static void main(String[] args) {
		//System.out.println(isPrime(19)); // true
		System.out.println(isPrime(6)); // false
		
		  //int a=19;
		//int b=20;
		//System.out.println(a/2);// quotient value
		//System.out.println(a%2);// reminder

	}

	public static boolean isPrime(int   n) {
		if (n == 0 ||  n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}