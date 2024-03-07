package com.spring.student;

public class StudentDetails {
	private String name;
	private int age;

	public StudentDetails(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
	}
}