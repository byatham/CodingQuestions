package com.anu.tech;

import java.util.HashMap;
import java.util.Map;

public class StringSplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ProductCode = 123, ProductName=Tshirt, ProductSize=Small";
		String[] split = str.split("= ");
		for(String st:split)
		{
			//System.out.println(st);
		}
		
		Map<String,String> map=new HashMap<>();
		
	 for(int i=0; i<split.length;i++)
	 {
		 for(int j=i+1; j<split.length;j++)
		 {
			 map.put(split[i],split[j]);
			// System.out.println(map);
		 }
	 }
    System.out.println(map);
   
	}

}
