package com.ravi.arrays;

import java.util.Arrays;

public class NaiveMoveZeroToEnd {

	public static void naiveMoverZeroToEnd(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] != 0) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
		}
	}
	// Time complexity ==> O(N^2).

	public static void main(String[] args) {

		int[] arr = { 10, 0, 20, 0, 34, 0, 0, 54 };
		System.out.println(Arrays.toString(arr));
		naiveMoverZeroToEnd(arr);
		System.out.println(Arrays.toString(arr));

	}

}
