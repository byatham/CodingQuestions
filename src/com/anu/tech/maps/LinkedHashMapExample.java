package com.anu.tech.maps;

import java.util.LinkedHashMap;
/* Summary
1.LinkedHashMap maintains the insertion order of elements, unlike TreeMap, which sorts elements by keys.
2.It provides predictable iteration order, which is the order in which keys were inserted into the map.
3.Operations like containsKey, get, put, and remove have constant time complexity O(1) for LinkedHashMap.
4.LinkedHashMap is useful when you need a map that maintains the order of elements as they were inserted.
5.Using LinkedHashMap is straightforward and useful when the insertion order needs to be preserved.
6.LinkedHashMap will multiple null keys and values but it will overridden to last insertion 
*/
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add elements to the LinkedHashMap
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Orange", 30);
        linkedHashMap.put("Grapes", 40);
        linkedHashMap.put(null, null);// overridden
        linkedHashMap.put(null, 50);//overridden 
        linkedHashMap.put(null, 60);// output null=60
        linkedHashMap.put("Apple1", 100); // LinkedHashMap: {Apple=10, Banana=20, Orange=30, Grapes=40, null=60, Apple1=100}


        // Display the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Iterate over the LinkedHashMap
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Access elements
        System.out.println("Value for key 'Apple': " + linkedHashMap.get("Apple"));

        // Remove an element
        linkedHashMap.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedHashMap);

        // Check if a key exists
        System.out.println("Contains key 'Orange'? " + linkedHashMap.containsKey("Orange"));

        // Check if a value exists
        System.out.println("Contains value 30? " + linkedHashMap.containsValue(30));
    }
}
