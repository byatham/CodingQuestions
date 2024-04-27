package com.anu.tech;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //List<Integer> numbers=Arrays.asList(10,20,30,40,50,10,30);
		
		int[] list= {10,20,30,50,90};// out put 10, 20
		
		for(int i=list.length-1; i>=0;i--)
		{
			
			System.out.println(list[i]);
			
		}


	}

}
