package com.cisco.training.enums;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setGrade(StudentGrades.GRADE_A);

		s1.setGrade('z');
	}

}
