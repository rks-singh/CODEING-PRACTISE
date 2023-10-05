package com.ravi.arrays;

import java.util.Arrays;

public class LeftRotateArray {

	/**
	 * UseCase ==> Left rotate an array by one place
	 * 			   left rotation ==> Anti clock wise rotation.
	 * @param arr
	 */
	public static void leftRoatteArray(int[] arr) {
		int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1]=temp;
	}
	
	//Time Complexity ==> O(N)
	public static void main(String[] args) {
		
		int[] arr = {2,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		leftRoatteArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}
