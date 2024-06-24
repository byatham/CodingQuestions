package com.anu.tech.string;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInReverseOrder {
    public static void main(String[] args) {
        String s = "yatham";
        // Convert the string to a Character array
        Character[] charArray = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }

        // Sort the array in reverse order
        Arrays.sort(charArray, Collections.reverseOrder());

        // Convert the sorted array back to a string
        StringBuilder sortedString = new StringBuilder(charArray.length);
        for (char c : charArray) {
            sortedString.append(c);
        }

        System.out.println("Sorted in reverse order: " + sortedString.toString());
    }
}
