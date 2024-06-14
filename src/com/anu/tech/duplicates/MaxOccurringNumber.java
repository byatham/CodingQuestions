package com.anu.tech.duplicates;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringNumber {
	
    public static int findMaxOccurringNumber(int[] numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Count the occurrences of each number
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the number with the maximum occurrences
        int maxCount = 0;
        int maxOccurringNumber = -1;
        
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxOccurringNumber = entry.getKey();
            }
        }
        
        return maxOccurringNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4,4,4,4,4};
        System.out.println("The most frequently occurring number is: " + findMaxOccurringNumber(numbers));
    }
}
