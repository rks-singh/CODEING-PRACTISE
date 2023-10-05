package com.ravi.arrays;

import java.util.Arrays;

public class ReverseAnArray {
	
	public static void reverseArray(int[] arr) {
		
		int first =0, last = arr.length-1;
		while(first<=last) {
			int temp = arr[first];
			arr[first]= arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
	}
	
	//Time Complexity ==> O(N)
	//Space Complexity ==> O(1)
	
	public static void main(String[] args) {
		int[] arr = {8,7,6,5,4,3,2,1};
		System.out.println(Arrays.toString(arr));
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
