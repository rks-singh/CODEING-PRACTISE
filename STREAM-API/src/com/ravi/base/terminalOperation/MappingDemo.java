package com.ravi.base.terminalOperation;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MappingDemo {
    public static void main(String[] args) {
        mapping();
    }
    public static void mapping() {

        List<String> nameList = StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));
        System.out.println(nameList);


        Set<String> nameSet = StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toSet()));

        System.out.println(nameSet);
    }
}
