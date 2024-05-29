package com.anu.tech.faqs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FindFirstNonOccurenceCharacter {
	    public static void main(String[] args) {
	        String str = "balaiahb";
	        String firstNonRepeatedOccurance = Arrays.stream(str.split(""))
	        .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
	        .entrySet().stream()
	        .filter(c-> c.getValue()==1)
	        .findFirst().get().getKey();
	        
	        System.out.println("firstNonRepeatedOccurance : "+firstNonRepeatedOccurance);
	        
	    }
	}

