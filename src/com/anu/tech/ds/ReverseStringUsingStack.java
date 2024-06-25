package com.anu.tech.ds;

import java.util.Stack;

public class ReverseStringUsingStack {

		 public static void main(String[] args) {
		       // String input = "Hello, World!";//Reversed String: !dlroW ,olleH
		        String input = "Balaiah, Yatham!";
		        String reversed = reverseString(input);
		        System.out.println("Original String: " + input);
		        System.out.println("Reversed String: " + reversed);
		    }

		    public static String reverseString(String str) {
		        // Create a stack to hold characters
		        Stack<Character> stack = new Stack<>();

		        // Push all characters of the string onto the stack
		        for (char c : str.toCharArray()) {
		            stack.push(c);
		        }

		        // Pop characters from the stack to build the reversed string
		        StringBuilder reversed = new StringBuilder();
		        while (!stack.isEmpty()) {
		            reversed.append(stack.pop());
		        }

		        return reversed.toString();
		    }
	}

