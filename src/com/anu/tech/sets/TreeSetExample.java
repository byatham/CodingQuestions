package com.anu.tech.sets;

import java.util.TreeSet;
/* Summary:
1.TreeSet is an ordered collection that doesn't allow duplicate elements.
2.It maintains elements in sorted order based on their natural ordering or a custom comparator.
3.TreeSet provides a guaranteed log(n) time cost for basic operations like add, remove, and contains.
4.The iteration order of elements in a TreeSet is based on their sorted order.
5.TreeSet is useful when you need a sorted collection of unique elements without any specific order requirements.
6. It will not allow null 
7.Use an iterator to traverse elements in sorted order.
8.Use first() and last() methods to access the first and last elements.
9.Use headSet() and tailSet() methods to obtain subsets of the TreeSet based on a specified element.
*/
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        treeSet.add("Apple");
       // treeSet.pollFirst(); //TreeSet: [Banana, Grapes, Orange]
       // treeSet.add(null);
        //treeSet.add(null);


        // Display the TreeSet
        System.out.println("TreeSet: " + treeSet);
        //first and last
        System.out.println("first and last");
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());


        // Iterate over the TreeSet using an iterator
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Fruit: " + fruit);
        }

        // Access elements (no direct access like with Map)
        // Remove an element (no direct remove by value like with Map)
        // Check if an element exists (no containsValue method like with Map)
    }
}
