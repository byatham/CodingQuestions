package com.anu.tech.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesAndReverse {
    public static void main(String[] args) {
        String name = "Balaiah Yatham";
        
        // Split the name into words
        String[] words = name.split(" ");
        
        // Process each word to find duplicate characters
        Map<String, Long> duplicatesCountMap = Arrays.stream(words)
            .collect(Collectors.toMap(
                Function.identity(),
                word -> word.chars()
                            .mapToObj(c -> (char) c)
                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                            .values().stream()
                            .filter(count -> count > 1)
                            .mapToLong(Long::longValue)
                            .sum()
            ));
        
        // Reverse the order of words
        List<String> reversedWords = Arrays.asList(words);
        Collections.reverse(reversedWords);
        
        // Print the results
        duplicatesCountMap.forEach((word, count) -> 
            System.out.println(word + "=" + count + " duplicates"));
        
        System.out.println("Reversed words: " + String.join(" ", reversedWords));
    }
}
