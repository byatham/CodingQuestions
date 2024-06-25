package com.anu.tech.ds;

import java.util.Stack;
//4. Stack
//A Stack is a Last In, First Out (LIFO) data structure. Elements are added and removed from the top.
public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10); // Add element
		stack.push(20);
		int top = stack.pop(); // Remove element // 20 //System.out.println(top);
		
		System.out.println(stack);//10

	}

}
