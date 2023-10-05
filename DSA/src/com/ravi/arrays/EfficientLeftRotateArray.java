package com.ravi.arrays;

import java.util.Arrays;

public class EfficientLeftRotateArray {

	// Reversal Algorithm..
	public static void leftRotate(int[] arr, int d) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}

	public static void reverse(int[] arr, int low, int high) {

		while (low <= high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

	// Time Complexity ==> O(N)
	// Space Complexity ==> O(1)

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 7, 8 };
		System.out.println(Arrays.toString(arr));
		leftRotate(arr, 3);
		System.out.println(Arrays.toString(arr));

	}

}
