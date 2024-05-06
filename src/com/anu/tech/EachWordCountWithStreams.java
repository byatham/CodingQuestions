package com.anu.tech;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class EachWordCountWithStreams {
    public static void main(String[] args) {
        String str = "Hello Java . Java is a programming language. Java is widely used.";
       

        // Count occurrences of each word
        Map<String, Long> wordCounts = Arrays.stream(str.split("\\s+")) // Stream<String>
                .collect(Collectors.groupingBy(word -> word, Collectors.counting())); // Count occurrences
        
        Optional<Entry<String,Long>> maxRepeatedWord = wordCounts.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println("maxRepeatedWord "+maxRepeatedWord.get());

        // Print the result
        wordCounts.forEach((word, count) -> System.out.println(word + ": " + count));
       
        /*
        Map<String,Integer> map=new HashMap<>();
        map.put("balaiah", 1);
        map.put("nagaiah", 3);

        map.forEach((a,b)-> System.out.println(a+" "+b)); */ 
        
        List<Integer> numbers = Arrays.asList(1,2,1,3,2,4,5,4,5,6,7,1,1);
        
        Map<Integer, Long> collectNumbersMap = numbers.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        
        Entry<Integer, Long> maxRepeatedKey = collectNumbersMap.entrySet().stream()
        .max(Map.Entry.comparingByValue())
        .orElse(null);
        
        System.out.println(maxRepeatedKey);
        
        
        
        
        //collectNumbersMap.forEach((n1,n2)-> System.out.println(n1+" -> "+n2));
        
        
    }
}
