package com.anu.tech;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringToMapStreamApi {
	
	 public static Map<String, Integer> toMap(String input) 
	    { 
	        Map<String, Integer> lengthMap = Arrays.stream(input.split(" ")) 
	                  .collect(Collectors.toMap( 
	                      value 
	                      -> value, 
	                      value -> value.length())); 
	  
	        return lengthMap; 
	    } 

	public static void main(String[] args) {
		 // Function to convert the string 
	    // to the map 
	   
	    
	        String input = "Geeks for Geek"; 
	  
	        System.out.println(toMap(input)); 
	    
	}

}
