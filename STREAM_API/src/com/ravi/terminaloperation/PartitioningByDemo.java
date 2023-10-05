package com.ravi.terminaloperation;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.ravi.studentdb.Student;
import com.ravi.studentdb.StudentDataBase;

public class PartitioningByDemo {
	public static void main(String[] args) {

		partitioningBy_1();
		System.out.println("=".repeat(30));
		partitioningBy_2();
	}

	public static void partitioningBy_1() {
		Map<Boolean, List<Student>> studentList = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.partitioningBy(student -> student.getGpa() >= 3.8));

		System.out.println(studentList);
	}

	public static void partitioningBy_2() {
		Map<Boolean, Set<Student>> studentSet = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.partitioningBy(student -> student.getGpa() >= 3.8, Collectors.toSet()));

		System.out.println(studentSet);
	}
}
