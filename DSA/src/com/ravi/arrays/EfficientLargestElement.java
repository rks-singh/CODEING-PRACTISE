package com.ravi.arrays;

import java.util.Arrays;

public class EfficientLargestElement {

    public static int efficientLargestElement(int[] arr) {
        int result =0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[result]) {
                result = i;
            }
        }
        return  result;
    }
    // Time complexity ==> O(n)

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 7, 6};
        System.out.println(Arrays.toString(arr));
        int result = efficientLargestElement(arr);
        System.out.println("Largest Element :: " + arr[result]);

    }
}

