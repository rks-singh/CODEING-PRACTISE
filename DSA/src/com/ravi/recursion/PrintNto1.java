package com.ravi.recursion;

public class PrintNto1 {
    public static void printNto1(int number) {
        if (number == 0) {
            return;
        }
        System.out.print(number+" ");
        printNto1(number-1);
    }

    public static void main(String[] args) {
        printNto1(50);
    }
}
