package com.ravi.base.numericStream;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.Optional;

public class FindFirst_FindAny_Demo {
    public static void main(String[] args) {
        findFirst().ifPresent(System.out::println);
        findAny().ifPresent(System.out::println);
    }


    public  static Optional<Student> findFirst(){
        return StudentDataBase.getStudentDetails()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }

    public static Optional<Student> findAny(){
        return StudentDataBase.getStudentDetails()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }
}
