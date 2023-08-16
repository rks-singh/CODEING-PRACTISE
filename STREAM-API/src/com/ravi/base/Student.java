package com.ravi.base;

import java.util.List;

public class Student{
   private final String name;
   private final int gradeLevel;
   private final double gpa;
   private final String gender;
   private final List<String> hobbies;
   private  int noteBook;

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> hobbies, int noteBook) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.hobbies = hobbies;
        this.noteBook = noteBook;
    }

    public String getName() {
        return name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public int getNoteBook() {
        return noteBook;
    }

    @Override
    public String toString() {
        return "{" +
                "Name='" + name + '\'' +
                ", GradeLevel=" + gradeLevel +
                ", Gpa=" + gpa +
                ", Gender='" + gender + '\'' +
                ", Hobbies=" + hobbies +
                ", NoteBook=" + noteBook +
                '}';
    }
}
