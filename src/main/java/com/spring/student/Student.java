package com.spring.student;

public class Student {
	String division;

	public Student(String division) {
		this.division = division;
	}

	public void admission() {
		System.out.println("I need admission in division = " + division);
	}

}
