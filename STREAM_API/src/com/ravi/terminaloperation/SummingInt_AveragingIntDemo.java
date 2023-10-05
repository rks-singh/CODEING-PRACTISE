package com.ravi.terminaloperation;

import java.util.stream.Collectors;

import com.ravi.studentdb.Student;
import com.ravi.studentdb.StudentDataBase;

public class SummingInt_AveragingIntDemo {

	public static void main(String[] args) {
		System.out.println("Sum of Notebook ::" + sum());
		System.out.println("Average of NoteBook ::" + average());
	}

	public static int sum() {
		return StudentDataBase.getStudentDetails().stream().collect(Collectors.summingInt(Student::getNoteBook));
	}

	public static double average() {
		return StudentDataBase.getStudentDetails().stream().collect(Collectors.averagingInt(Student::getNoteBook));
	}
}
