package com.ravi.numericstream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAgrigateDemo {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,100).sum();
        System.out.println("Sum :"+sum);

        OptionalInt minValue = IntStream.rangeClosed(1,200).min();
        minValue.ifPresent(System.out::println);

        OptionalInt maxValue =  IntStream.rangeClosed(2,30).max();
        maxValue.ifPresent(System.out::println);

        OptionalDouble averageValue = IntStream.rangeClosed(1,100).average();
        averageValue.ifPresent(System.out::println);
    }
}
