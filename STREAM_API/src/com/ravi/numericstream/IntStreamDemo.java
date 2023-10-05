package com.ravi.numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamDemo {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum of Number = "+sumOfNumbers(integerList));
        System.out.println("Sum of Number = "+sumOfNumbersIntStream());
    }


    // This is not a good approach. because lot of unboxing will be performed.
    public static int sumOfNumbers(List<Integer> integerList) {

        return  integerList.stream()
                .reduce(0,Integer::sum);
    }

    // good approach
    public static  int sumOfNumbersIntStream() {
        return IntStream.rangeClosed(1,6).sum();
    }
}
