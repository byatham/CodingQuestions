package com.anu.tech.maps;

import java.util.Map;

/* Summary
1.TreeMap is a sorted map that maintains order based on natural ordering or a custom comparator.
2.It provides efficient log-time cost for the containsKey, get, put, and remove operations.
3.TreeMap is useful when you need a map that maintains a sorted order of keys.
4. TreeMap will not allow null key
*/
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 30);
        treeMap.put("Apple", 10);
        treeMap.put("Grapes", 40);
        treeMap.put("mango", null);


        // Display the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Iterate over the TreeMap
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Access elements
        System.out.println("Value for key 'Apple': " + treeMap.get("Apple"));

        // Remove an element
        treeMap.remove("Banana");
        System.out.println("After removing 'Banana': " + treeMap);

        // Check if a key exists
        System.out.println("Contains key 'Orange'? " + treeMap.containsKey("Orange"));

        // Check if a value exists
        System.out.println("Contains value 30? " + treeMap.containsValue(30));
    }
}
