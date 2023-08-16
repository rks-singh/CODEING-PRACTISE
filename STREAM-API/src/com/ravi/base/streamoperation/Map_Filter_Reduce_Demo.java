package com.ravi.base.streamoperation;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

public class Map_Filter_Reduce_Demo {

    public static void main(String[] args) {
        System.out.println("No. of NoteBooks ="+getNoNotebooks());
        System.out.println("No. of NoteBooks ="+getResult());
    }
    public static int getNoNotebooks(){
       return StudentDataBase.getStudentDetails()
                .stream()
                .map(Student::getNoteBook)
                .reduce(0, Integer::sum);
    }
    // getting no. of notebook a/c to grade > 3.0 and gender is "Female"
    public static int getResult(){
        return StudentDataBase.getStudentDetails()
                .stream()
                .filter(student -> student.getGradeLevel()>=3.0)
                .filter(student -> student.getGender().equals("Female"))
                .map(Student::getNoteBook)
                .reduce(1,Integer::sum);
    }
}
