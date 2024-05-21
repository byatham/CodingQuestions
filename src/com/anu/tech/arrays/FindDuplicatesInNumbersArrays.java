package com.anu.tech.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesInNumbersArrays {

    public static void main(String[] args) {
        // Example array of numbers
        int[] numbers = {10,20,10,30,20,10};
       List<Integer> duplicatesInArray = Arrays.stream(numbers).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting()))
        .entrySet().stream()
        .filter(x->x.getValue()>1)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
       
        System.out.println("Duplicates from Numbers Array :: "+duplicatesInArray);

        // Find duplicates
       // Set<Integer> duplicates = findDuplicates(numbers);

        // Output the result
        //System.out.println("Duplicates: " + duplicates);
    }

}
