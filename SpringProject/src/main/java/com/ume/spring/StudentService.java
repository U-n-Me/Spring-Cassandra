package com.ume.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class StudentService {
	private List<Student> students = new ArrayList<Student>(Arrays.asList(new Student("Ume", "CS10", 22), new Student("U-me", "ME12", 21),
			new Student("Kavi", "EE13", 11)));
	
	public List<Student> getStudents(){
		return students;
	}
	
	public Student getStudent(int id){
		return students.stream().filter(student -> student.getId() == id).findFirst().get();
	}
	
	public void addStudent(Student student){
		students.add(student);
	}

	public void updateStudent(int id, Student student) {
		for(int i = 0; i < students.size(); i++){
			if(id == students.get(i).getId()){
				students.set(i, student);
				return;
			}
		}
	}

	public void deleteStudent(int id) {
		for(int i = 0; i < students.size(); i++){
			if(id == students.get(i).getId()){
				students.remove(i);
				return;
			}
		}
	}
}
