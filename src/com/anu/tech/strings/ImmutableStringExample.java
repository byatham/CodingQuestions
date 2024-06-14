package com.anu.tech.strings;

import java.time.LocalDate;

public class ImmutableStringExample {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        
        // s1 and s2 point to the same object in the string pool
        System.out.println(s1 == s2); // true
        
        String s3 = new String("hello");
        System.out.println(s1 == s3); // false, because s3 is created with 'new' keyword

        // Modifying a string results in a new object
        String s4 = s1.toUpperCase();
        System.out.println(s1); // hello
        System.out.println(s4); // HELLO
        System.out.println(s1.intern().equals(s4.intern()));
        
       System.out.println(LocalDate.now().plusMonths(3).getDayOfWeek());
       
     
    }
}
