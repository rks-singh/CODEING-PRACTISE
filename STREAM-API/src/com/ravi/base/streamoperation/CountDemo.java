package com.ravi.base.streamoperation;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.List;

public class CountDemo {

    // getting student hobbies count.
    public static Long getStudentHobbiesCount(){
        return StudentDataBase.getStudentDetails().stream()
                .map(Student::getHobbies)
                .flatMap(List::stream)
                .count();
    }

    // getting student unique hobbies count.
    public static  Long getStudentUniqueHobbiesCount(){
        return StudentDataBase.getStudentDetails().stream()
                .map(Student::getHobbies)
                .flatMap(List::stream)
                .distinct()
                .count();
    }
    public static void main(String[] args) {

        System.out.println(getStudentHobbiesCount());
        System.out.println(getStudentUniqueHobbiesCount());
    }
}
