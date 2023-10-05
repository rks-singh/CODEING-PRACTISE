package com.ravi.streamoperation;

import java.util.List;
import java.util.stream.Collectors;

import com.ravi.studentdb.Student;
import com.ravi.studentdb.StudentDataBase;

public class FlatMapDemo {

	// getting student hobbies list.
	public static List<String> getStudentHobbiesList() {
		return StudentDataBase.getStudentDetails().stream().map(Student::getHobbies).flatMap(List::stream)
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		System.out.println(getStudentHobbiesList());
	}
}
