package com.ravi.base.factoryMethod;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FactoryMethod {
    public static void main(String[] args) {

    //        Of() method demo.
        Stream<String> stream  = Stream.of("John","Jack","Jim");
        stream.forEach(System.out::println);

    //  iterate() method.

        Stream.iterate(1,x->x*2)
                .limit(20)
                .forEach(System.out::println);

//        generate method.

        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(20)
                .forEach(System.out::println);


    }


}
