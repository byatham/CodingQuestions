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
		map.put("D","Anu");
		
		//map.put(new Key("vishal"), 20);

		System.out.println(map);
		
		

	}

}
