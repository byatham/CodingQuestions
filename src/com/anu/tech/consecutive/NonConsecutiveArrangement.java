package com.anu.tech.consecutive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NonConsecutiveArrangement {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 10, 12};
        
        //out put  Non-consecutive arrangement: 1 3 5 7 9 11 2 4 6 8 10 12 

        // Sort the array
        List<Integer> sortedList = Arrays.stream(num).sorted().boxed().collect(Collectors.toList());
        System.out.println("sorted **** "+sortedList);

        int[] rearranged = new int[num.length];
        int index = 0;

        // Place elements at even indices first
        for (int i = 0; i < sortedList.size(); i += 2) {
            if (index < num.length) {
                rearranged[index] = sortedList.get(i);
                index++;
            }
        }

        // Place elements at odd indices next
        for (int i = 1; i < sortedList.size(); i += 2) {
            if (index < num.length) {
                rearranged[index] = sortedList.get(i);
                index++;
            }
        }

        // Print the rearranged array
        System.out.print("Non-consecutive arrangement: ");
        IntStream.of(rearranged).forEach(n -> System.out.print(n + " "));
    }
}
