package com.anu.tech;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 1, 7, 4, 12, 6, 8);

        // Using Java 8 streams to find the maximum number
        Integer maxNumber = numbers.stream()
                                  .max(Integer::compareTo)
                                  .orElseThrow(() -> new RuntimeException("List is empty"));

        System.out.println("Maximum number: " + maxNumber);
        
        Integer minNumber = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("List is empty"));

System.out.println("minNumber number: " + minNumber);


    }
}
