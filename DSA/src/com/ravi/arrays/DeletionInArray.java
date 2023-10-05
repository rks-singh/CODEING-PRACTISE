package com.ravi.arrays;

public class DeletionInArray {
	private final int[] arr;

	public DeletionInArray(int[] arr) {
		this.arr = arr;
	}

	public void display() {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public int deletionInArray(int size, int x) {
		// if deleted element will be last element.
		if (x == this.arr[size - 1]) {
			return (size - 1);
		}
		int i;
		// finding position of element
		for (i = 0; i < size; i++) {
			if (this.arr[i] == x) {
				break;
			}
		}
		// if size of an array equal to i simply return current size.
		if (i == size) {
			return size;
		}
		// deleting an element.
		for (int j = i; j < size - 1; j++) {
			this.arr[j] = this.arr[j + 1];
		}
		return (size - 1);
	} // Time Complexity ==> O(n)

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 5;

		int cap = 3;
		int size = arr.length;

		DeletionInArray deletionInArray = new DeletionInArray(arr);
		deletionInArray.display();
		deletionInArray.deletionInArray(size, 2);
		deletionInArray.display();

	}
}
