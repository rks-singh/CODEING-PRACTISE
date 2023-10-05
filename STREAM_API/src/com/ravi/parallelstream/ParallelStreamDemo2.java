package com.ravi.parallelstream;

import java.util.List;
import java.util.stream.Collectors;

import com.ravi.studentdb.Student;
import com.ravi.studentdb.StudentDataBase;

// here parallel stream takes less time than sequential stream.
public class ParallelStreamDemo2 {

    public static void main(String[] args) {
        System.out.println(sequentialPrintStudentHobbies());
        System.out.println(parallelPrintStudentHobbies());
    }
    public static List<String> sequentialPrintStudentHobbies() {
        long startTime = System.currentTimeMillis();
        List<String> result = StudentDataBase.getStudentDetails()
                .stream()
                .map(Student::getHobbies)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration of Execution of Sequential Stream ::"+(endTime-startTime)+"MS");
        return result;
    }
    public static List<String> parallelPrintStudentHobbies() {
        long startTime = System.currentTimeMillis();
        List<String> result = StudentDataBase.getStudentDetails()
                .parallelStream()
                .map(Student::getHobbies)
                .flatMap(List::parallelStream)
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration of Execution of Parallel Stream ::"+(endTime-startTime)+"MS");
        return result;
    }
}
