package com.ravi.base.numericStream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntLongStreamRangeDemo {

    public static void main(String[] args) {

        // Range example with IntStream
        IntStream intStream = IntStream.range(1,50);
        System.out.println("Range Count :"+ intStream.count());

        IntStream.range(1,50).forEach(x -> System.out.print(x+" "));

        System.out.println();

        System.out.println("Range Closed Count :"+ IntStream.rangeClosed(1,50).count());

        IntStream.rangeClosed(1,50).forEach(x->System.out.print(x+" "));
        System.out.println();

        System.out.println("LongStream range count :" + LongStream.range(1, 50).count());
        System.out.println("LongStream rangeClosed Count :" + LongStream.rangeClosed(1, 50).count());

        IntStream.rangeClosed(1, 40).asDoubleStream().forEach(x -> System.out.print(x + " "));

    }
}
