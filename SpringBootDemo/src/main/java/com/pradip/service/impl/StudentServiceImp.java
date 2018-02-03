package com.pradip.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pradip.pojo.Student;
import com.pradip.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {

	private static List<Student> students = new ArrayList<Student>();
	
	static {
		for (int i = 0; i < 5; i++) {
			Student student = new Student(i, "Aparna " + i, "Math");
			students.add(student);
		}
	}
	
	@Override
	public List<Student> getAllStudent() {
		return students;
	}

	@Override
	public Student getStudent(Long id) {
		Student student = null;
		for (Student studentTemp : students) {
			if (studentTemp.getId() == id)
				student = studentTemp;
		}
		return student;
	}
}
