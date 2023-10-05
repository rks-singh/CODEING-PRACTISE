package com.ravi.streamoperation;

import java.util.List;
import java.util.stream.Collectors;

import com.ravi.studentdb.Student;
import com.ravi.studentdb.StudentDataBase;

public class FilterDemo {

	public static List<Student> filterFemaleStudent() {
		return StudentDataBase.getStudentDetails().stream().filter(student -> student.getGender().equals("Female"))
				.collect(Collectors.toList());
	}

	public static List<Student> filterStudentWithGpa() {
		return StudentDataBase.getStudentDetails().stream().filter(student -> student.getGender().equals("Female"))
				.filter(student -> student.getGpa() >= 3.6).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		StudentDataBase.getStudentDetails().forEach(System.out::println);
		System.out.println("==".repeat(50));
		filterFemaleStudent().forEach(System.out::println);
		System.out.println("==".repeat(50));
		filterStudentWithGpa().forEach(System.out::println);
	}
}
