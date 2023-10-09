package com.ravi.arrays;

public class NaiveMaximumEvenOddSubarray {

	public static int maximumEvenOddSubarray(int[] arr) {
		int result = 1;
		for (int i = 0; i < arr.length; i++) {
			int currCount = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (((arr[j] % 2 == 0) && (arr[j - 1] % 2 != 0)) 
						|| ((arr[j] % 2 != 0) && (arr[j - 1] % 2 == 0))) {
					
					currCount++;
				} else {
					break;
				}
			}
			result = Math.max(result, currCount);
		}
		return result;
	}
	// Time Complexity ==> O(N^2)
	
	public static void main(String[] args) {
		int[] arr= {5,10,20,6,3,8};
		System.out.println("Maximum Even and Odd Subarray ::"+maximumEvenOddSubarray(arr));
		
	}
}
