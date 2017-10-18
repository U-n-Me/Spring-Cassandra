package com.ume.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@Autowired
	private StudentService studentService; 	
	
	@RequestMapping("/add")
	public int add(@RequestParam(value="id1") int a, @RequestParam(value="id2") int b){
		return a+b;
	}
	
	@RequestMapping("/students")
	public List<Student> students(){
		return studentService.getStudents();
	}
	
	@RequestMapping("/student")
	public Student studentById(@RequestParam int id){
		return studentService.getStudent(id);
	}
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public String addStudent(@RequestBody Student student){
		studentService.addStudent(student);
		return "Added Successfully!";
	}
	
	@RequestMapping("/delete/student/{id}")
	public String delete(@PathVariable int id){
		studentService.deleteStudent(id);
		return "Deleted Succesfully!!";
	}
	
	@RequestMapping(value= "/student/{id}", method = RequestMethod.PUT)
	public void updateStuden(@RequestBody Student student, @PathVariable int id){
		studentService.updateStudent(id, student);
	}
}
