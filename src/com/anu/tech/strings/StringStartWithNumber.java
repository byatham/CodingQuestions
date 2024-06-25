package com.anu.tech.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartWithNumber {
    public static void main(String[] args) {
        // Sample ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("123abc");
        arrayList.add("def456");
        arrayList.add("789xyz");
        arrayList.add("abc123");
        arrayList.add("BLR");

        
        // Filter elements starting with a digit
        List<String> result = arrayList.stream()
                                       .filter(s -> Character.isDigit(s.charAt(0)))
                                       .collect(Collectors.toList());
        
        // Print the result
        System.out.println("Elements starting with a digit: " + result);
    }
}
