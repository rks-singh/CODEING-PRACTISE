package com.ravi.terminaloperation;

import java.util.stream.Collectors;

import com.ravi.studentdb.Student;
import com.ravi.studentdb.StudentDataBase;

public class JoiningDemo {

	public static void main(String[] args) {

		System.out.println("Output of Joining_1 ::" + joining_1());
		System.out.println("Output of Joining_2 ::" + joining_2());
		System.out.println("Output of Joining_3 ::" + joining_3());

	}

	public static String joining_1() {
		return StudentDataBase.getStudentDetails().stream().map(Student::getName).collect(Collectors.joining());
	}

	public static String joining_2() {
		return StudentDataBase.getStudentDetails().stream().map(Student::getName).collect(Collectors.joining("-"));
	}

	public static String joining_3() {
		return StudentDataBase.getStudentDetails().stream().map(Student::getName)
				.collect(Collectors.joining(",", "[", "]"));
	}
}
