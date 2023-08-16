package com.ravi.base.streamoperation;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println("Product ="+performMultiplication(integers));
        System.out.println("Sum ="+performAddition(integers));

        Optional<Integer> result = performMul(integers);
        /*
        if(result.isPresent()) {
            System.out.println(result.get());
        }*/
        result.ifPresent(System.out::println);

        Optional<Integer> result1 = performMul(new ArrayList<>());
        result1.ifPresent(System.out::println);

       /* Optional<com.ravi.base.Student> gpaResult = getHighestGpa();
        if (gpaResult.isPresent()) {
            System.out.println(gpaResult.get());
        }*/
        getHighestGpa().ifPresent(System.out::println);
    }

    public static  int performMultiplication(List<Integer> integers){
        return  integers.stream()
                .reduce(1,(x,y)->x*y);
        /*
        *  1 step ==> a=1,b=1 form stream a*b = 1 returned
        *  2 step ==> a=1,b=3 from stream a*b = 3 returned
        *  3 step ==> a=3,b=5 from stream a*b = 15 returned
        *  4 step ==> a=15,b=7 from stream a*b = 105 returned ==> final result.
        * */
    }

    public static int performAddition(List<Integer> integers) {
        return integers.stream()
                .reduce(0, Integer::sum);
    }

    // reduce() method without initial value.
    public static Optional<Integer> performMul(List<Integer> integers){
        return integers.stream()
                .reduce((x,y)->x*y);
    }

    public static Optional<Student> getHighestGpa() {
        return StudentDataBase.getStudentDetails()
                .stream()
                .reduce((s1,s2)->s1.getGpa()>s2.getGpa()?s1:s2);
    }
}
