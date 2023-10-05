package com.ravi.arrays;

import java.util.Arrays;

public class EfficientMoveZeroToEnd {

	public static void efficientMoveZeroToEnd(int[] arr) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
	}
	
	// Time Complexity ==> O(N)
	
	public static void main(String[] args) {
		int[] arr = { 10, 0, 20, 0, 34, 0, 0, 54 };
		System.out.println(Arrays.toString(arr));
		efficientMoveZeroToEnd(arr);
		System.out.println(Arrays.toString(arr));

	}

}
