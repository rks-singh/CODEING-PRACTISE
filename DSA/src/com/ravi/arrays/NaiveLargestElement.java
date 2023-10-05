package com.ravi.arrays;

import java.util.Arrays;

public class NaiveLargestElement {
    public static int naiveLargestElement(int[] arr) {

        for (int i : arr) {
            boolean flag = true;
            for (int j : arr) {
                if (j > i) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }

    // Time Complexity ==> O(N^2)

    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 8, 5, 7};
        int result = naiveLargestElement(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Largest Element :: " + result);
    }
}
