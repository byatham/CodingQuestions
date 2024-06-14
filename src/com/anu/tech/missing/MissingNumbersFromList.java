package com.anu.tech.missing;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbersFromList {
	
    public static void main(String[] args) {
        // Given list with some missing numbers
        List<Integer> givenList = new ArrayList<>();
        givenList.add(1);
        givenList.add(2);
        givenList.add(3);
        givenList.add(4);
        givenList.add(5);
        // Add the rest of the given numbers here

        // Create a list of numbers from 1 to 100
        List<Integer> fullList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            fullList.add(i);
        }

        // Find missing numbers by comparing the two lists
        List<Integer> missingNumbers = new ArrayList<>();
        for (int number : fullList) {
            if (!givenList.contains(number)) {
                missingNumbers.add(number);
            }
        }

        System.out.println("Missing numbers: " + missingNumbers);
    }
}
