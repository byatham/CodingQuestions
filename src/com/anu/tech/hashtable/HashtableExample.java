package com.anu.tech.hashtable;

import java.util.Hashtable;
import java.util.Enumeration;
/* Summary:
1.Hashtable is a legacy class that implements a hash table, which maps keys to values.
2.It is similar to HashMap, but it is synchronized and doesn't allow null keys or values.
3.Hashtable provides a guaranteed constant time complexity O(1) for basic operations like get, put, and contains.
4.The iteration order of elements in a Hashtable is not guaranteed and may vary between different executions.
5.Hashtable is useful when you need a synchronized hash table with key-value mappings and thread-safe operations.
*/


public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Add elements to the Hashtable
        hashtable.put("Apple", 10);
        hashtable.put("Banana", 20);
        hashtable.put("Orange", 30);
        hashtable.put("Grapes", 40);
        hashtable.put("Grapes", 40);
       //hashtable.put(null, 40); //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
        //hashtable.put("Grapes", null);// Exception in thread "main" java.lang.NullPointerException



        // Display the Hashtable
        System.out.println("Hashtable: " + hashtable);

        // Iterate over the Hashtable using an enumeration
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }

        // Access elements (no direct access like with Map)
        // Remove an element (no direct remove by value like with Map)
        // Check if a key exists
        // Check if a value exists
    }
}
