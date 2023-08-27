package com.ravi.recursion;

public class SumOfDigit {
    public static int getSum(int n) {
        if (n == 0) {
            return  0;
        }
        return getSum(n/10)+(n%10);
        // Time Complexity ==> O(d)
        // Space Complexity ==> O(d).
    }

    public static int getSumIterative(int n) {
        int result =0;
        while (n != 0) {
            int rem = n%10;
            result +=rem;
            n /=10;
        }
        return result;

        // Time Complexity ==> O(d)
        // Space Complexity ==> O(1).
    }
    public static void main(String[] args) {
        System.out.println("Sum of Digit ::"+getSum(386));
        System.out.println("Sum of Digit ::"+getSum(386));
    }


}
