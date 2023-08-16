package com.ravi.base.terminalOperation;

import com.ravi.base.StudentDataBase;

import java.util.stream.Collectors;

public class CountingDemo {
    public static void main(String[] args) {
        System.out.println("Total Student ::"+count_1());
        System.out.println("Total Student ::"+count_2());
    }
    public static long count_1(){
        return StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.counting());
    }

    public static long count_2() {
        return StudentDataBase.getStudentDetails()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.counting());
    }


}
