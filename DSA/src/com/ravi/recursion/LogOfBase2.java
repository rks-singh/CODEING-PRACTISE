package com.ravi.recursion;

/*
*  This method return log of base 2 in flor.
* */
public class LogOfBase2 {
    public static int logOfBase2(int num) {
        if (num == 1) {
            return 0;
        } else {
            return 1+ logOfBase2(num/2);
        }
    } // Time Complexity ==> O(log(N))
    public static void main(String[] args) {
        int result = logOfBase2(2);
        System.out.println("Square Root ::"+result);
    }
}
