package com.ravi.arrays;

public class EfficientMaximumSubArray {
	
	public static int maximumSum(int[] arr) {
		int result = arr[0];
		int maxEnding = arr[0];
		for(int i=1; i<arr.length; i++) {
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			result = Math.max(maxEnding, result);
		}
		return result;
	}
	
	//Time Complexity ==> O(N)
	public static void main(String[] args) {
		int[] arr= {1,-2,3,-1,2};
		System.out.println("Maximum sum :: "+maximumSum(arr));
	}

}
