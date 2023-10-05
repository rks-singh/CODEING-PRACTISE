package com.ravi.numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MappingInNumericStream {

    public static void main(String[] args) {
        System.out.println("MapToObj ::"+mapToObj());
        System.out.println("MapToLong ::" + mapToLong());
        System.out.println("MapToDouble ::" + mapToDouble());
    }

    // mapToObj() ==> used to convert each element of numeric stream to same object.
    @SuppressWarnings("removal")
	public static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1,10)
                .mapToObj((i)->{
                   return new Integer(i);
                })
                .collect(Collectors.toList());
    }

    public static long mapToLong() {
        return IntStream.rangeClosed(1, 100)
                .mapToLong(i -> i)
                .sum();
    }

    public static double mapToDouble() {
        return IntStream.rangeClosed(1, 100)
                .mapToDouble(i->i)
                .sum();
    }
}
