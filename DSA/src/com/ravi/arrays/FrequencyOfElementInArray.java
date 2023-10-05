package com.ravi.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfElementInArray {
	
	/**
	 * Frequency in sorted array.
	 * @param arr
	 * @return result
	 */
	public static Map<Integer, Integer> frequncyOfElement(int[] arr){
		Map<Integer, Integer> result = new LinkedHashMap<>();
		int freq =1, i=1;
		while(i<arr.length) {
			while(i<arr.length && arr[i]==arr[i-1]) {
				freq++;
				i++;
			}
			result.put(arr[i-1], freq);
			freq =1;
			i++;
		}
		if(arr.length==1 || arr[arr.length-2]!=arr[arr.length-1]) {
			result.put(arr[arr.length-1], 1);
		}
		return result;
	}
	// Time complexity ==> O(N)
	
	public static void main(String[] args) {
		int[] arr= {10,10,10,25,30,30};
		Map<Integer, Integer> result = frequncyOfElement(arr);
		System.out.println(result);
	}
}
