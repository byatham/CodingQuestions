package com.anu.tech.fib;

public class Fibonacci {
	
	public static void generateFibonacci(int n) 
	{
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int[] fibSeries = new int[n];
        
        // Initialize the first two terms
        if (n >= 1) fibSeries[0] = 0;
        if (n >= 2) fibSeries[1] = 1;

        // Generate the Fibonacci series
        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
            System.out.println("i is  "+i+" ->  "+fibSeries[i]);
        }

        // Print the series
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibSeries[i] + " ");
        }
}

    public static void main(String[] args) {
        int n = 2; // Number of terms
        generateFibonacci(n);
    }

    
    }

