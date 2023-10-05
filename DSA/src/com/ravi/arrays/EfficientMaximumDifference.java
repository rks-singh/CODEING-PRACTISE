package com.ravi.arrays;

public class EfficientMaximumDifference {

	/**
	 * Maximum difference ==> arr[j] - arr[i] where j >i
	 * @param arr
	 * @return result
	 */
	public static int maximumDifference(int[] arr) {
		
		int result = arr[1] - arr[0];
		int minVal = arr[0];
		for(int i=1; i<arr.length; i++) {
			result = Math.max(result, arr[i]-minVal);
			minVal = Math.min(minVal, arr[i]);
		}
		return result;
	}
	// Time complexity ==> O(N)
	
	public static void main(String[] args) {
		int[] arr = { 2,3,10,6,4,8,1};
		int result = maximumDifference(arr);
		System.out.println("Maximum Difference ==> "+result);
	}
}
