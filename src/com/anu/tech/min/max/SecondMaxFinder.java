package com.anu.tech.min.max;

public class SecondMaxFinder {
    public static Integer findSecondMax(int[] numbers) {
        if (numbers.length < 2) {
            return null;  // Not enough elements to have a second maximum
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        System.out.println("max "+firstMax+" "+secondMax);

        for (int number : numbers) {
            if (number > firstMax) {
                secondMax = firstMax;
                firstMax = number;
            } else if (firstMax > number && number > secondMax) {
                secondMax = number;
            }
        }

        return (secondMax == Integer.MIN_VALUE) ? null : secondMax;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Integer secondMax = findSecondMax(numbers);
        if (secondMax != null) {
            System.out.println("The second maximum number is: " + secondMax);
        } else {
            System.out.println("There is no second maximum number.");
        }
    }
}
