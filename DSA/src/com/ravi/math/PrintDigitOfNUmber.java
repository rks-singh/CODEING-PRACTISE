package com.ravi.math;

import java.util.Scanner;

public class PrintDigitOfNUmber {
	
	public static void printDigitOfNumber(int num) {
		
		int temp = num,count=0;
		
		// Counting digit of number.
		while(temp!=0) {
			count++;
			temp /=10;
		}
		
		// Finding divisor based on total count of digit.
		int divisor = (int)Math.pow(10, count-1);
		System.out.println(divisor);
		System.out.println("Digit of Number "+num+" are :");
		while(divisor!=0) {
			int digit = num/divisor;
			System.out.println(digit);
			num %= divisor;
			divisor /= 10;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number to print it's digit : ");
		int num = scanner.nextInt();
		scanner.close();
		printDigitOfNumber(num);
	}

}
