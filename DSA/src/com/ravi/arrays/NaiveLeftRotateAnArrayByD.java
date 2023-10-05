package com.ravi.arrays;

import java.util.Arrays;

public class NaiveLeftRotateAnArrayByD {

	public static void leftRotateAnArray(int[] arr, int d) {
		int[] temp = new int[d];

		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		for (int i = d; i < arr.length; i++) {
			arr[i - d] = arr[i];
		}

		for (int i = 0; i < d; i++) {
			arr[arr.length - d + i] = temp[i];
		}

	}

	// Time Complexity ==> O(N*D)
	// Space Complexity ==> O(D)

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 7, 8 };
		System.out.println(Arrays.toString(arr));
		leftRotateAnArray(arr, 3);
		System.out.println(Arrays.toString(arr));
	}

}
