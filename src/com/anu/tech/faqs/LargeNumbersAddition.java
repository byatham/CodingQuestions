package com.anu.tech.faqs;

public class LargeNumbersAddition {

	public static void main(String args[]) {
			// "8944394323791464", "14472334024676221" 23416728348467685
			//"23416728348467685"
		String num1 = "10"; // "8944394323791464";

		String num2 = "21"; // "14472334024676221";
		String result = add(num1, num2);
		System.out.println(result);
	}

	public static String add(String a, String b) {
		StringBuilder sum = new StringBuilder();
		int carry = 0;

       // Start from least digit
		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || carry > 0; i--, j--) {
			
			int digitA = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0;
			int digitB = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0;
			int currentSum = digitA + digitB + carry;
			
			sum.insert(0, currentSum % 10); // insert the remainig digit
			carry = currentSum / 10;
		}
		return sum.toString();
	}
}