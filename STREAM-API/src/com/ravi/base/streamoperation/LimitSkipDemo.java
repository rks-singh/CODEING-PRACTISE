package com.ravi.base.streamoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitSkipDemo {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        limit(integerList).ifPresent(System.out::println);
        skip(integerList).ifPresent(System.out::println);
    }

    public static Optional<Integer> limit(List<Integer> integerList) {
        return integerList.stream()
                .limit(3) // 6,7,8
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> integerList) {
        return integerList.stream()
                .skip(2) // 8,9,10
                .reduce(Integer::sum);
    }
}
