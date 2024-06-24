package com.anu.tech.list;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharArrayToArrayList {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd'};

        // Using streams to convert char[] to ArrayList<Character>
        ArrayList<Character> charList = IntStream.range(0, charArray.length)
                                                 .mapToObj(i -> charArray[i])
                                                 .collect(Collectors.toCollection(ArrayList::new));

        // Printing the ArrayList
        System.out.println(charList);
    }
}
