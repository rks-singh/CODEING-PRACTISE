package com.ravi.arrays;

public class EfficientMaximumEvenOddSubarray {

	public static int maximumEvenOddSubarray(int[] arr) {
		int result=1;
		int currCount=1;
		for(int i=1; i<arr.length; i++) {
			if(((arr[i]%2==0)&&(arr[i-1]%2!=0))||
					((arr[i]%2!=0)&&(arr[i-1]%2==0))) {
				
				currCount++;
				result = Math.max(currCount, result);
			}else {
				currCount=1;
			}
		}
		return result;
	}
	// Time Complexity ==> O(N)
	public static void main(String[] args) {
		int[] arr= {5,10,20,6,3,8};
		System.out.println("Maximum Even and Odd Subarray ::"+maximumEvenOddSubarray(arr));
	}
}
