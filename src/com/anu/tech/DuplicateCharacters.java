package com.anu.tech;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count only duplicated count
		String name="balaiahbc";
		char[] nameChar=name.toCharArray();
		Map<Character,Integer> countMap=new HashMap<>();
		for(int i=0; i<nameChar.length;i++)
		{
			boolean repeated=false;
			for(int j=i+1; j<nameChar.length;j++)
			{
				if(nameChar[i]== nameChar[j])
				{
					//System.out.println(nameChar[i]);
					//repeated=true;
					
					if(!countMap.containsKey(nameChar[i]))
					{
						countMap.put(nameChar[i], 1);
					}
					else
					{
						int count=countMap.get(nameChar[i]);
						countMap.put(nameChar[i], count+1); 
					}
				}
			}
		}
		System.out.println(countMap);

	}}
