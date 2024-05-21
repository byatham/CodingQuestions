package com.anu.tech.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicatesInList {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 2, 5, 3, 6, 6};
        

        // Convert array to a list and then to a stream
        List<Integer> list = Arrays.asList(numbers);
       
     
      //  list.add(90);// Exception in thread "main" java.lang.UnsupportedOperationException
     //System.out.println(list);
        // Group elements by their occurrences
        Map<Integer, Long> counts = list.stream()
                                       .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(counts);
        list.stream().distinct().forEach(System.out::println);

        // Filter grouped elements to find duplicates
        List<Integer> duplicates = counts.entrySet().stream()
                                         .filter(entry -> entry.getValue() > 1)
                                         .map(Map.Entry::getKey)
                                         .collect(Collectors.toList());

        System.out.println("Duplicates: " + duplicates); // Output: Duplicates: [2, 3, 6]
        
        String name="Amalapuram";
        Map<Character, Long> charCount = name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        
        System.out.println(charCount);
    }
}
