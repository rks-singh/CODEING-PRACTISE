package com.ravi.arrays;

import java.util.Arrays;

public class EfficientSecondLargest {

    public static int efficientSecondLargest(int[] arr) {

        int largest =0, result =-1;
        for (int i = 1; i < arr.length; i++) {
        	
            if (arr[i] > arr[largest]) {
                result = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (result == -1 || arr[i] > arr[result]) {
                    result =i;
                }
            }
        }
        return result;
    }
    // Time Complexity ==> O(N)
    public static void main(String[] args) {
 
        int[] arr = {2, 4, 8, 5, 9, 7};
        int result = efficientSecondLargest(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Second Largest :: "+arr[result]);
    }
}
