package com.anu.tech.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Accessing an element
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Modifying an element
        fruits.set(1, "Blueberry");
        System.out.println("Modified list: " + fruits); // Output: [Apple, Blueberry, Cherry]

        // Removing an element
        fruits.remove(2);
        System.out.println("After removal: " + fruits); // Output: [Apple, Blueberry]

        // Checking size
        System.out.println("Size: " + fruits.size()); // Output: 2

        // Iterating using a for-each loop
        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterating using an iterator
        System.out.println("Using iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
