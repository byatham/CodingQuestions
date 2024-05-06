package com.anu.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

// find repeated one and non repeated one from given string
public class FrequecnyTest {
	
	String name=null;
	
	public void test(String name)
	{
		
		char[] charArray2 = name.toCharArray();
		
		  // Creating a char array
       // char[] charArray = {'a', 'b', 'c', 'd', 'e'};

        // Converting char array to ArrayList
        List<Character> charArrayList = new ArrayList<>();
        for (char c : charArray2) {
            charArrayList.add(c);
        }
        //charArrayList.stream().filter(s-> s.matches(".*[aeiou].*")).collect(Collectors.toList());
        
        List<Character> collect = charArrayList.stream().filter(s-> s.toString().matches(".*[aeiou].*")).collect(Collectors.toList());
        
       System.out.println("test data"+collect);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************  ");
		
		   List<Integer> asList = Arrays.asList(1,2,3,4,5);
		   
		  
		   Optional<Integer> findFirst = asList.stream().skip(4).findFirst();
		   System.out.println("find max second "+(findFirst));
		   
		   
		   
		   
		   
		
		FrequecnyTest ft=new FrequecnyTest();
		ft.test("bbbb");
		
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
