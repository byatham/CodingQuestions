package com.anu.tech;

import java.util.HashMap;
import java.util.Map;

public class StringToMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="Aashish:1, Bina:2, Chintu:3";
		System.out.println("given text as string :: "+text);
		String[] parts = text.split(",");
		
		Map<String,String> studentMap=new HashMap<>();
		Map<String,String> productMap=new HashMap<>();
		
		for(String part:parts)
		{
			   String[] studentData = part.split(":");
			   
			   String studentName = studentData[0].trim();
			   String studentRollNumber = studentData[1].trim();
			   
			   studentMap.put(studentName, studentRollNumber);
		}
		
		System.out.println(studentMap);
			
		
		// 
		
		String products = "ProductCode = 123, ProductName= Tshirt, ProductSize  =  Small";
		String[] productParts = products.split(",");
		
		for(String part:productParts)
		{
			String[] productData = part.split("=");
			
			String prodcutName = productData[0].trim();
			String productCode = productData[1].trim();
			
			productMap.put(prodcutName, productCode);
		}
		System.out.println("products ::"+productMap);


	}
	
	

}
