package com.anu.tech;

import java.util.HashMap;
import java.util.Map;

public class StringToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ProductCode = 123, ProductName=Tshirt, ProductSize=Small";
		String[] split = str.split("=");
		System.out.println(split.toString());
		int k=0;
		
		/*
		 * for(String st:split) { //System.out.println(st); }
		 */
		
		Map<String,String> map=new HashMap<>();
		
	 for(int i=0; i<split.length;i++)
	 {
		 for(int j=i+1; j<split.length;j++)
		 {
			 map.put(split[i],split[j]);
			// System.out.println(map);
		 }
	 }
	 
	 for(int i=0; i<split.length;i++)
	 {
		 
		 while(i+1>i)
		 {
			 map.put(split[i],split[i+1]);
			 break;
			// System.out.println(map);
		 }
	 }
	 
	 System.out.println(map);
		/*
		 * for(int i=0; i<split.length;i++) { do { map.put(split[i],split[i+1]); }
		 * while(true) {
		 * 
		 * // System.out.println(map); } }
		 */
	 
	 
	 //map print and iterate
	 for(Map.Entry<String, String> myMap:map.entrySet())
	 {
		// System.out.println("key - "+myMap.getKey()+" Value - "+myMap.getValue());
	 }
		/*
		 * System.out.println(map); System.out.println("*******************");
		 * 
		 * Map<String,String> demoMap=new HashMap<>();
		 * 
		 * demoMap.put("name", "Balaiah"); demoMap.put("education", "B.TECH");
		 * System.out.println(demoMap);
		 */
	}

	
	
	
}
