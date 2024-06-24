package com.anu.tech.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTestStreamOperations {

	public static void main(String[] args) {
		
		Employee e1=new Employee("balaiah", 36, "hyderabad");
		Employee e2=new Employee("nagaiah", 30, "secunderabad");
		Employee e3=new Employee("balaiah", 35, "hyderabad");
		Employee e4=new Employee("yellaiah", 39, "hyderabad");
		Employee e5=new Employee("chennaiah", 40, "hyderabad");

        System.out.println("******************");
        List<Employee> asList = Arrays.asList(e1,e2,e3,e4,e5);
        //removing duplicates by using distinct()
        asList.stream().distinct().forEach(System.out::println);
        
        System.out.println("******************");
        //filtering names based some condition
        asList.stream().filter(s-> s.getName().equals("balaiah")).forEach(System.out::println);
		
        
        //find max age employee 
        System.out.println("******************");
       Optional<Employee> collect = asList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)));
        System.out.println(collect.get());
        
        System.out.println("******************");
        //min age
        Optional<Employee> collect1 = asList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));

        System.out.println(collect1.get());
        
        List<Integer> listN=Arrays.asList(1,2,3,4,5);
        
        Optional<Integer> max = listN.stream().max(Integer::compareTo);
        System.out.println(max.get());
        
        Optional<Integer> min = listN.stream().min(Integer::compareTo);
        System.out.println(min.get());
        
       // listN.stream().map(Comparator.reverseOrder()).skip(1);
        
        List<Employee> namesBased = asList.stream().filter(x-> x.getName().startsWith("ba")).collect(Collectors.toList());
        
        System.out.println(namesBased);
        
        asList.stream().map(x-> x.getAge()).sorted(Comparator.reverseOrder())
        //.skip(0)
        .limit(3)
        .forEach(System.out::println);
   
	}

}
