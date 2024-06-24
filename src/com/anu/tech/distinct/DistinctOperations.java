package com.anu.tech.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DistinctOperations {

	public static void main(String[] args) {
      System.out.println("*********************");
      
      List<Integer> list=Arrays.asList(1,2,1,3,2,4,5,6);
      //find outp put below
      list.stream().distinct().forEach(System.out::println);
      System.out.println("************");
      
      //each number multiply with 3
      
      list.stream().distinct().map(x-> x*3).forEach(System.out::println);// expected out put -> 3,6,9,12,15,18
      
       System.out.println("********************************* ");
       Optional<Integer> max = list.stream().max(Integer::compareTo);
       System.out.println("max "+max.get());
      
	}

}
