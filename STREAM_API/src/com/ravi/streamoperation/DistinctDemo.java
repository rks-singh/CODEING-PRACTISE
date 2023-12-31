package com.ravi.streamoperation;

import java.util.List;
import java.util.stream.Collectors;

import com.ravi.studentdb.Student;
import com.ravi.studentdb.StudentDataBase;

public class DistinctDemo {

	// getting student hobbies list.
	public static List<String> getHobbiesList() {
		return StudentDataBase.getStudentDetails().stream().map(Student::getHobbies).flatMap(List::stream)
				.collect(Collectors.toList());
	}

	// getting student unique hobbies list.
	public static List<String> getUniqueHobbiesList() {
		return StudentDataBase.getStudentDetails().stream().map(Student::getHobbies).flatMap(List::stream).distinct()
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(getHobbiesList());
		System.out.println("=".repeat(30));
		System.out.println(getUniqueHobbiesList());
	}
}
