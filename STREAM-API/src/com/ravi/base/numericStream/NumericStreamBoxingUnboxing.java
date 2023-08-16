package com.ravi.base.numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxing {

    public static void main(String[] args) {
        System.out.println("Boxed Result :: "+boxing());
        System.out.println("UnBoxed Result :: "+unBoxing(Arrays.asList(10,20,30,40,50)));
    }

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,20)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList) {

        return  integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
