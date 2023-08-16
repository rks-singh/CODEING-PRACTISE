package com.ravi.base;

import com.ravi.base.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {

    public static Supplier<Student> studentSupplier =()->{
        return new Student("Adam",2,3.6,"male", Arrays.asList("Cricket","Basketball","Volleyball"),11);
    };
    public  static List<Student> getStudentDetails(){
        /*
        * 2nd grade student.
        */
        Student student1 = new Student("Adam",2,3.6,"male", Arrays.asList("Cricket","Basketball","Volleyball"),11);
        Student student2 = new Student("Jenny", 2, 3.8, "Female", Arrays.asList("Swimming", "Basketball", "Volleyball"),12);
        /*
        * 3rd grade student.
        * */
        Student student3 = new Student("Emily", 3, 4.0, "Female", Arrays.asList("Basketball", "Swimming", "Volleyball"),10);
        Student student4 = new Student("Dave",3,3.9,"Male",Arrays.asList("Cricket","Hockey","Swimming"),9);
        /*
        * 4th grade student.
        * */
        Student student5 = new Student("Sophia",4,3.5,"Female",Arrays.asList("Swimming","Basketball","Swimming"),15);
        Student student6 = new Student("James",4,3.9,"Male",Arrays.asList("Cricket","Hockey","Basketball"),14);

        return Arrays.asList(student1,student2,student3,student4,student5,student6);
    }
}
