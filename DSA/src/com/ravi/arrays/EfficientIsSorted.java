package com.ravi.arrays;

import java.util.Arrays;

public class EfficientIsSorted {

    public static boolean efficientIsSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    // Time Complexity ==> O(n)

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,8};
        System.out.println(Arrays.toString(arr));
        System.out.println("Array is Sorted :: " + efficientIsSorted(arr));
    }
}
