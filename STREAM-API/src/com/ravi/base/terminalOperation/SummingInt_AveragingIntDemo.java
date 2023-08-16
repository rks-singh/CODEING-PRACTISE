package com.ravi.base.terminalOperation;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.stream.Collectors;

public class SummingInt_AveragingIntDemo {

    public static void main(String[] args) {
        System.out.println("Sum of Notebook ::" + sum());
        System.out.println("Average of NoteBook ::"+average());
    }

    public static int sum() {
        return StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBook));
    }

    public static double average() {
        return StudentDataBase.getStudentDetails()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBook));
    }
}
