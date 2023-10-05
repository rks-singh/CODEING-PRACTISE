package com.ravi.arrays;

import java.util.Arrays;

public class EfficientRemoveDuplicate {

	/**
	 * UseCase ==> You have to remove duplicate element in an given array
	 * 			   No modification required for array size.
	 * @param arr
	 * @return result
	 */
	public static int efficientRemoveDuplicate(int[] arr) {
		int result = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[result - 1] != arr[i]) {
				arr[result] = arr[i];
				result++;
			}
		}
		return result;
	}
	
	//Time Complexity ==> O(N)
	//Space Complexity ==> o(1)
	
	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 30, 30, 30 };
		System.out.println(Arrays.toString(arr));
		int size = efficientRemoveDuplicate(arr);
		System.out.println("Size of an array after removeing duplicate ::" + size);
		System.out.println(Arrays.toString(arr));

	}

}
