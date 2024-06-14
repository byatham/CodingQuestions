package com.anu.tech.system;

public class SystemExitTest {

	public static void main(String[] args) {
		System.out.println("SystemExitTest ******  ==> ");  
		try
		{
			System.exit(0);// program will terminate here with successfully, finally block also wont execute
			
		}catch (Exception e) {
			System.out.println("this is from exception block ");
		}
		finally {
			System.out.println("this is from finally block ");
		}
	}

}
