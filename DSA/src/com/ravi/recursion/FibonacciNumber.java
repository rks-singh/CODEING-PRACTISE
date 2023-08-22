package com.ravi.recursion;

public class FibonacciNumber {

    public static int fibonacciNumber(int n) {
        if (n <= 1) {
            return  n;
        }
        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Number :"+fibonacciNumber(3));
    }
}
