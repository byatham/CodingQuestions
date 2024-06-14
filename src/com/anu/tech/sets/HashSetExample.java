package com.anu.tech.sets;

import java.util.HashSet;
/* Summary:
1.HashSet is an unordered collection that doesn't allow duplicate elements.
2.It provides constant time complexity O(1) for basic operations like add, remove, and contains.
3.The iteration order of elements in a HashSet is not guaranteed and may vary between different executions.
4.HashSet is useful when you need a collection of unique elements without any specific order requirements.
5.it will allow null 
6. if you keep duplicate elements overridden . only one time will show
*/
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add(null);
        hashSet.add("Apple");

        // Display the HashSet
        System.out.println("HashSet: " + hashSet);

        // Iterate over the HashSet using an iterator
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Fruit: " + fruit);
            if(fruit!=null&&fruit.equals("Banana"))
            {
            	hashSet.remove("Banana");
            }
        }

        // Access elements (no direct access like with Map)
        // Remove an element (no direct remove by value like with Map)
        // Check if an element exists (no containsValue method like with Map)
    }
}
