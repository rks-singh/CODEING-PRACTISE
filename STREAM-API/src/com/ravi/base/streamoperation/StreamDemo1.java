package com.ravi.base.streamoperation;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo1 {

    public static void main(String[] args) {

        Predicate<Student> gradeLevel =  student -> student.getGradeLevel()>=3;
        Predicate<Student> getGpa = student ->  student.getGpa()>=3.9;

         Map<String, List<String>> studentMap = StudentDataBase.getStudentDetails().stream()
                 .peek(System.out::println)
                 .filter(gradeLevel)
                 .peek(student -> {
                     System.out.println("After 1st Filter "+student);
                 })
                 .filter(getGpa)
                 .peek(student ->{
                     System.out.println("After 2nd Filter "+student);
                 })
                 .collect(Collectors.toMap(Student::getName,Student::getHobbies));
         System.out.println(studentMap);
    }
}
