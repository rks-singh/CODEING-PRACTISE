package com.ravi.arrays;

import java.util.Arrays;

public class NaiveIsSorted {

    public static boolean naiveIsSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return  true;
    }
    // Time Complexity ==> O(n^2)

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,8};
        System.out.println(Arrays.toString(arr));
        System.out.println("Array is Sorted :: " + naiveIsSorted(arr));
    }
}
