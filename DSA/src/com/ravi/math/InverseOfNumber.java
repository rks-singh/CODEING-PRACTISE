package com.ravi.math;

import java.util.Scanner;

public class InverseOfNumber {
	
	public static int inverseOfNumber(int num) {
		
		int inverse =0, orignalPosition =1;
		while(num !=0) {
			int orignalDigit = num%10;
			int invertDigit = orignalPosition;
			int invertPosition = orignalDigit;
			inverse = inverse + (invertDigit * (int)Math.pow(10, invertPosition-1));
			num = num/10;
			orignalPosition++;
		}
		return inverse;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number to find it's Inverse : ");
		int num = scanner.nextInt();
		scanner.close();
		System.out.println("Inverse of "+num+" is :: "+inverseOfNumber(num));

	}

}
