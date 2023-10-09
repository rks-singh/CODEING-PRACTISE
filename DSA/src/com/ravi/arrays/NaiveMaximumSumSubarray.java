package com.ravi.arrays;

public class NaiveMaximumSumSubarray {

	public static int maximumSum(int[] arr) {
		int result = arr[0];
		for(int i=0; i<arr.length; i++) {
			int currSum =0;
			for(int j=i; j<arr.length; j++) {
				currSum = currSum+arr[j];
				result = Math.max(currSum, result);
			}
		}
		return result;
	}
	// Time Complexity ==> O(N^2)
	
	public static void main(String[] args) {
		
		int[] arr= {1,-2,3,-1,2};
		System.out.println("Maximum sum :: "+maximumSum(arr));
	}
}
