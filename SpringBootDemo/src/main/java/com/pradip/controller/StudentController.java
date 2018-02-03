package com.pradip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pradip.pojo.Student;
import com.pradip.service.StudentService;

@RestController
@RequestMapping(value = "/rest")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> getAllStudent() {
		return this.studentService.getAllStudent();
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("id") Long id) {
		return this.studentService.getStudent(id);
	}
}
