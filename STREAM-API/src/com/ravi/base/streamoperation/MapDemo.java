package com.ravi.base.streamoperation;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapDemo {
   /*
   * Use case
   * ============
   * 1. get list of student name from student database.
   * 2. convert all student name into uppercase.
   * 3. return list of student name.
   *  */

    // getting list of student name.
    public static List<String> getStudentNameList(){
        return StudentDataBase.getStudentDetails().stream()
                // 1st use case getting name
                .map(Student::getName)
                // 2nd use case converting all name to uppercase
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    // getting set of student name.
    public static Set<String> getStudentNameSet(){
        return StudentDataBase.getStudentDetails().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(getStudentNameList());
        System.out.println(getStudentNameSet());
    }
}
