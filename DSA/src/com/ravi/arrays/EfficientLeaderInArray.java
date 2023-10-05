package com.ravi.arrays;

public class EfficientLeaderInArray {

	public static void leaderInArray(int[] arr) {

		int curr_leader = arr[arr.length - 1];
		System.out.print(curr_leader+" ");
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > curr_leader) {
				curr_leader = arr[i];
				System.out.print(curr_leader + " ");
			}
		}
	}
	// Time Complexity ==> O(N)
	
	public static void main(String[] args) {

		int[] arr = { 7, 10, 4, 10, 6, 5, 2 };
		leaderInArray(arr);
	}

}
