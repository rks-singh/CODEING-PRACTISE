package com.ravi.base.streamoperation;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {

    // getting student name in sorted order [ increasing order of alphabet]
    public static List<String> getStudentName_I(){
        return  StudentDataBase.getStudentDetails().stream()
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList());
    }
    // getting student name in sorted order [ decreasing order of alphabet]
    public static  List<String> getStudentName_D(){
        return  StudentDataBase.getStudentDetails().stream()
                .map(Student::getName)
                .sorted((s1,s2)-> s2.charAt(0) - s1.charAt(0))
                .collect(Collectors.toList());
    }

    // getting student name in sorted order [ according to length of name]
    public static  List<String> getStudentName_LI(){
        return StudentDataBase.getStudentDetails().stream()
                .map(Student::getName)
                .sorted((s1,s2)-> s1.length() - s2.length())
                .collect(Collectors.toList());
    }

    public static  List<String> getStudentName_LD(){
        return StudentDataBase.getStudentDetails().stream()
                .map(Student::getName)
                .sorted((s1,s2)->s2.length() - s1.length())
                .collect(Collectors.toList());
    }

    // sorting student by their name.
    public static List<Student> sortStudentByName(){
        return StudentDataBase.getStudentDetails()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    // sorting student by their gpa
    public static  List<Student> sortStudentByGpa(){
        return  StudentDataBase.getStudentDetails()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println(getStudentName_I());
        System.out.println(getStudentName_D());
        System.out.println(getStudentName_LI());
        System.out.println(getStudentName_LD());

        System.out.println("==".repeat(50));
        StudentDataBase.getStudentDetails().forEach(System.out::println);
        System.out.println("==".repeat(50));
        sortStudentByName().forEach(System.out::println);
        System.out.println("==".repeat(50));
        StudentDataBase.getStudentDetails().forEach(System.out::println);
        System.out.println("==".repeat(50));
        sortStudentByGpa().forEach(System.out::println);
    }

}
