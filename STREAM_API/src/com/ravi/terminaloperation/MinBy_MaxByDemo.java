package com.ravi.terminaloperation;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ravi.studentdb.Student;
import com.ravi.studentdb.StudentDataBase;

public class MinBy_MaxByDemo {

	public static void main(String[] args) {
		minBy().ifPresent(System.out::println);
		maxBy().ifPresent(System.out::println);
	}

	public static Optional<Student> minBy() {
		return StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}

	public static Optional<Student> maxBy() {
		return StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
}
