package com.anu.tech.employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeTestEqualsAndHashCode {

	public static void main(String[] args) {
		
		Employee e1=new Employee("balaiah", 33, "hyderabad");
		Employee e2=new Employee("nagaiah", 30, "secunderabad");
		Employee e3=new Employee("balaiah", 33, "hyderabad");
		
        System.out.println("******************");
		
		System.out.println(e1==e2);// false
		System.out.println(e1==e3);// false
		System.out.println(e2==e3); //false  all because we are using new key word to create object hence all object have different addresses
		
		System.out.println(e1.hashCode()==e3.hashCode());//true
		System.out.println(e3.hashCode());
		System.out.println("*******************");
		System.out.println(e1.equals(e2));// false //checking with objects content
		System.out.println(e1.equals(e3));// true
		
		System.out.println("##################244424#########");
		
		
		Map<Employee,Object> map=new HashMap<>();
		
		map.put(e1, e1);
		map.put(e2, e2);
		map.put(e3, e3);
		System.out.println("size "+map.size());// size is 2 if we implement proper equals and hashcode method. otherwise size is 3
		
		map.forEach((key,value)-> System.out.println("key "+key+" value "+value));
		
		Set<Employee> s1=new HashSet<>();
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		System.out.println("****** "+s1);
		


		

	}

}
