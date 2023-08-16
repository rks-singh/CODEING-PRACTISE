package com.ravi.base.terminalOperation;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinBy_MaxByDemo {

    public static void main(String[] args) {
        minBy().ifPresent(System.out::println);
        maxBy().ifPresent(System.out::println);
    }
    public static Optional<Student> minBy() {
        return StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy() {
        return StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }
}
