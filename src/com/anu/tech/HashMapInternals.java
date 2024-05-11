package com.anu.tech;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map=new HashMap<>();
		map.put("A","Anu");
		map.put("B","Anu");
		map.put("C","Anu");
		map.put("D","gg");
		
		//map.put(new Key("vishal"), 20);
		
		map.forEach((a,b)-> System.out.println(a+" "+b));

		//System.out.println(map);
		
		for(Map.Entry<String, String> map1:map.entrySet())
		{
			//System.out.println(map1.getKey());
			//map.remove(map1.getKey());
		}
		
		

	}

}
