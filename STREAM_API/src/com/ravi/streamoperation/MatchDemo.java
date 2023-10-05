package com.ravi.streamoperation;

import com.ravi.studentdb.StudentDataBase;

public class MatchDemo {

	public static void main(String[] args) {

		System.out.println("Result of all Match :" + allMatch());
		System.out.println("Result of any Match :" + anyMatch());
		System.out.println("Result of none Match :" + nonMatch());

	}

	public static boolean allMatch() {
		return StudentDataBase.getStudentDetails().stream().allMatch(student -> student.getGpa() >= 3.9);
	}

	public static boolean anyMatch() {
		return StudentDataBase.getStudentDetails().stream().anyMatch(student -> student.getGpa() >= 3.9);
	}

	public static boolean nonMatch() {
		return StudentDataBase.getStudentDetails().stream().noneMatch(student -> student.getGpa() >= 5.0);
	}

}
