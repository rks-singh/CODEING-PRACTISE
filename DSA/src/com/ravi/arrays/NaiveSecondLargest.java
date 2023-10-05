package com.ravi.arrays;

import java.util.Arrays;

public class NaiveSecondLargest {

    public static int getLargest(int[] arr) {
        int largest =0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                largest =i;
            }
        }
        return  largest;
    }
    public static int naiveSecondLargest(int[] arr) {

        int largest = getLargest(arr);
        int result = -1; // if second largest not exist.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largest]) {
                if (result == -1) {
                    result =i;
                } else if (arr[i]>arr[result]) {
                    result =i;
                }
            }
        }
        return  result;
    }
    // Time Complexity ==> O(n)

    public static void main(String[] args) {
        int[] arr={2,5,8,10,3,9};
        System.out.println(Arrays.toString(arr));
        int result = naiveSecondLargest(arr);
        System.out.println("Second Largest :: "+arr[result]);
    }
}
