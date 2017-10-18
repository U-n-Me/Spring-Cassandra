package com.ume.spring;


public class Student {
	private String name, school;
	private int id;

	public Student() {

	}

	public Student(String name, String school, int age) {
		super();
		this.name = name;
		this.school = school;
		this.id = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public void setId(int age) {
		this.id = age;
	}

}
