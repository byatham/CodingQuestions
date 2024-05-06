package com.anu.tech;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// find repeated one and non repeated one from given string
public class FrequecnyTest {
	
	public static void main(String[] args) {
		
		
		String givenString="Bangalore Chennai Hyderabad Bangalore Mumbai Chennai";
		//sprlit and converto String[]
		
		String[] cities=givenString.split(" ");
		//add array to arraylist. use arrays.aslist
		List<String> citiesList = Arrays.asList(cities);
		
		//find dulicated one
		
		List<String> filtredData1 = citiesList.stream().filter(c-> Collections.frequency(citiesList, c)>1).collect(Collectors.toList());
		
		System.out.println("duplicated in string "+filtredData1);
		
		// repeated duplicated print only once
		
		Set<String> filtredData2 = citiesList.stream().filter(c-> Collections.frequency(citiesList, c)>1).collect(Collectors.toSet());

		System.out.println("duplicated one print only once "+filtredData2);
		
		
		//find only non repeated one in string 
		
		List<String> filtredData3 = citiesList.stream().filter(c-> Collections.frequency(citiesList, c)<=1).collect(Collectors.toList());
        System.out.println("non repeated one "+filtredData3);
		

	}

}
