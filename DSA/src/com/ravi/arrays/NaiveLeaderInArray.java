package com.ravi.arrays;

public class NaiveLeaderInArray {

	public static void leaderInArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	//Time Complexity ==> O(N^2)
	
	public static void main(String[] args) {

		int[] arr = { 7, 10, 4, 10, 6, 5, 2 };
		leaderInArray(arr);
	}

}
