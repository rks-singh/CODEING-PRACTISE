package com.ravi.optional;

import java.util.Optional;

import com.ravi.studentdb.Student;
import com.ravi.studentdb.StudentDataBase;

public class OptionalDemo3 {

	public static void main(String[] args) {
		System.out.println("Name :" + optionalOrElse());
		System.out.println("Name :" + optionalOrElseGet());
		System.out.println("Name :" + optionalOrElseThrow());
	}

	// orElse(); returns actual String.
	public static String optionalOrElse() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		return optionalStudent.map(Student::getName).orElse("Default");
	}

	// orElseGet(); returns Supplier().
	public static String optionalOrElseGet() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		return optionalStudent.map(Student::getName).orElseGet(() -> "Default");
	}

	// orElseThrow(); returns Supplier with Runtime Exception.
	public static String optionalOrElseThrow() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		return optionalStudent.map(Student::getName).orElseThrow(() -> new RuntimeException("Data not Available"));
	}
}
