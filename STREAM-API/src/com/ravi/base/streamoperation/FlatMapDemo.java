package com.ravi.base.streamoperation;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    // getting student hobbies list.
    public static List<String> getStudentHobbiesList(){
        return StudentDataBase.getStudentDetails().stream()
                .map(Student::getHobbies)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println(getStudentHobbiesList());
    }
}
