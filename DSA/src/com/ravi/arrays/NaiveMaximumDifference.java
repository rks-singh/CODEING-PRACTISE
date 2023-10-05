package com.ravi.arrays;


public class NaiveMaximumDifference {

	/**
	 * Maximum difference ==> arr[j] - arr[i] where j >i
	 * @param arr
	 * @return result
	 */
	public static int maximumDifference(int[] arr) {
		
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]>arr[i]) {
					result = Math.max(result, arr[j]-arr[i]);
				}
			}
		}
		return result;
	}
	// Time Complexity ==> O(N^2)
	
	public static void main(String[] args) {
		int[] arr = { 2,3,10,6,4,8,1};
		int result = maximumDifference(arr);
		System.out.println("Maximum Difference ==> "+result);

	}

}
