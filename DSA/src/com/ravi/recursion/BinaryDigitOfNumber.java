package com.ravi.recursion;

/*
 *  This method returns binary equivalent of a number.
 */

public class  BinaryDigitOfNumber {
    public static void binaryDigit(int number) {
        if (number == 0) {
            return;
        }
        binaryDigit(number / 2);
        System.out.print(number%2+" ");

    } //Time Complexity ==> O(log(N)).

    public static void main(String[] args) {
        binaryDigit(7);
    }
}
