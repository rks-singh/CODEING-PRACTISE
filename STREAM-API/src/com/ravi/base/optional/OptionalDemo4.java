package com.ravi.base.optional;

import java.util.Optional;

public class OptionalDemo4 {
    public static void main(String[] args) {
        isPresent();
        ifPresent();
    }
    //isPresent(); it returns either true or false, a/c to availability of data present.
    public static void isPresent() {
        Optional<String> optional = Optional.ofNullable("Ravi");
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Data not present");
        }
    }
    //ifPresent(); it give direct access to value, and allow operation to perform.
    public static void ifPresent() {
        Optional<String> optional = Optional.ofNullable("Ravi");
        optional.ifPresent(System.out::println);
    }
}
