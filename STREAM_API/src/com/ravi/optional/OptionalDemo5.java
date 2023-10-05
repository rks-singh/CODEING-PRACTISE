package com.ravi.optional;

import java.util.Optional;

import com.ravi.studentdb.Student;
import com.ravi.studentdb.StudentDataBase;

public class OptionalDemo5 {
	public static void main(String[] args) {
		optionalFilter();
		optionalMap();
		optionalFlatMap();
	}

	// filter() method. it used to filter out data.
	public static void optionalFilter() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		optionalStudent.filter(student -> student.getGpa() >= 3.5).ifPresent(System.out::println);
	}

	public static void optionalMap() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if (optionalStudent.isPresent()) {
			optionalStudent.filter(student -> student.getGpa() >= 3.5).map(Student::getName)
					.ifPresent(System.out::println);
		}
	}

	public static void optionalFlatMap() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if (optionalStudent.isPresent()) {
			optionalStudent.filter(student -> student.getGpa() >= 3.5).map(Student::getHobbies)
					.ifPresent(System.out::println);
		}
	}
}
