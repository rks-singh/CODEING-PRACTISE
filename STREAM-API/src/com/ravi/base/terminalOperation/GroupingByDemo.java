package com.ravi.base.terminalOperation;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByDemo {

    public static void main(String[] args) {
        groupByGender();
        System.out.println("=".repeat(30));
        customizedGroupingBy();
        System.out.println("=".repeat(30));
        twoLevelGrouping_1();
        System.out.println("=".repeat(30));
        twoLevelGrouping_2();
        System.out.println("=".repeat(30));
        twoLevelGrouping_3();
        System.out.println("=".repeat(30));
        threeLevelGrouping_4();
        System.out.println("=".repeat(30));
        studentTopGpa_1();
        System.out.println("=".repeat(30));
        studentTopGpa_2();
        System.out.println("=".repeat(30));
        studentMinGpa();
    }

    public static void groupByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void customizedGroupingBy() {
        Map<String, List<Student>> studentMap = StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1() {

        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")
                ));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2() {

       Map<Integer,Integer> studentMap = StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(Student::getNoteBook)));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_3() {
        Map<String,Integer> studentMap = StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBook)));

        System.out.println(studentMap);
    }

    public static void threeLevelGrouping_4() {
        LinkedHashMap<String, Set<Student>> studentMap = StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new,Collectors.toSet()));

        System.out.println(studentMap);
    }

    public static void studentTopGpa_1() {
        Map<Integer,Optional<Student>> topGpa =StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(topGpa);
    }

    public static void studentTopGpa_2() {
       Map<Integer,Student> topGpa = StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));

        System.out.println(topGpa);
    }

    public static void studentMinGpa() {
        Map<Integer,Student> minGpa = StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),Optional::get)));

        System.out.println(minGpa);
    }
}
