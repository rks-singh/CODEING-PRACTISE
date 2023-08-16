package com.ravi.base.optional;

import com.ravi.base.Student;
import com.ravi.base.StudentDataBase;

import java.util.Optional;

public class OptionalDemo1 {

    public static void main(String[] args) {
        String name = getStudentName();
        if (name != null) {
            System.out.println("Length of Student Name : " + name.length());
        } else {
            System.out.println("Name not found!!!");
        }

        Optional<String> stringOptional = getStudentNameOptional();
        if (stringOptional.isPresent()) {
            System.out.println("length of Student Name : " + stringOptional.get().length());
        } else {
            System.out.println("Name not found!!!");
        }
    }

    // example without optional.
    public static  String getStudentName() {
        Student student = StudentDataBase.studentSupplier.get();
        if (student != null) {
            return student.getName();
        }
        return null;
    }

    // example with optional....
    public static Optional<String> getStudentNameOptional() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (optionalStudent.isPresent()) {
            return optionalStudent.map(Student::getName);
        }
        return Optional.empty();  // return optional with empty value.
    }
}
