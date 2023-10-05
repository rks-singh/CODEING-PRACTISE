package com.ravi.numericstream;

import java.util.Optional;

import com.ravi.studentdb.Student;
import com.ravi.studentdb.StudentDataBase;

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
