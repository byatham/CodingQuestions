package com.anu.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //List<Integer> numbers=Arrays.asList(10,20,30,40,50,10,30);
		
		int[] list= {10,20,30,20,50,10};// out put 10, 20
		
		for(int i=0; i<list.length;i++)
		{
			
			boolean repeated=false;
			for( int j=i+1; j<list.length;j++)
			{
				if(list[i]==list[j])
				{
					System.out.println(list[i]);
					repeated=true;
					
				}
			}
			
		}

		boolean repeated=false;

	}

}
