package com.ravi.base.terminalOperation;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PartitioningByDemo {
    public static void main(String[] args) {

        partitioningBy_1();
        System.out.println("=".repeat(30));
        partitioningBy_2();
    }

    public static void partitioningBy_1() {
        Map<Boolean,List<Student>> studentList = StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.partitioningBy(student -> student.getGpa()>=3.8));

        System.out.println(studentList);
    }

    public static void partitioningBy_2() {
        Map<Boolean, Set<Student>> studentSet = StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.partitioningBy(student -> student.getGpa()>=3.8,Collectors.toSet()));

        System.out.println(studentSet);
    }
}
