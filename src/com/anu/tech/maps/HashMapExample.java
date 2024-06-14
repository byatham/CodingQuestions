package com.anu.tech.maps;

import java.util.HashMap;
/* Summary:
1.HashMap doesn't maintain any order of elements. It provides constant time complexity O(1) for basic operations like containsKey, get, put, and remove.
2.The iteration order of elements in a HashMap is not guaranteed and may vary between different executions.
3.HashMap is useful when you need a basic key-value mapping without any specific order requirements.
4. HashMap will allow single key as null but it will allows multiple values as null
5. on key hash function will be applied and then hash code will be generated
6. by using hash code then index value will be generated. based on index object will be placed in bucket.
*/
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 30);
        hashMap.put("Grapes", 40);

        // Display the HashMap
        System.out.println("HashMap: " + hashMap);

        // Iterate over the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Access elements
        System.out.println("Value for key 'Apple': " + hashMap.get("Apple"));

        // Remove an element
        hashMap.remove("Banana");
        System.out.println("After removing 'Banana': " + hashMap);

        // Check if a key exists
        System.out.println("Contains key 'Orange'? " + hashMap.containsKey("Orange"));

        // Check if a value exists
        System.out.println("Contains value 30? " + hashMap.containsValue(30));
    }
}
