package com.ravi.streamoperation;

import java.util.List;

import com.ravi.studentdb.Student;
import com.ravi.studentdb.StudentDataBase;

public class CountDemo {

	// getting student hobbies count.
	public static Long getStudentHobbiesCount() {
		return StudentDataBase.getStudentDetails().stream().map(Student::getHobbies).flatMap(List::stream).count();
	}

	// getting student unique hobbies count.
	public static Long getStudentUniqueHobbiesCount() {
		return StudentDataBase.getStudentDetails().stream().map(Student::getHobbies).flatMap(List::stream).distinct()
				.count();
	}

	public static void main(String[] args) {

		System.out.println(getStudentHobbiesCount());
		System.out.println(getStudentUniqueHobbiesCount());
	}
}
