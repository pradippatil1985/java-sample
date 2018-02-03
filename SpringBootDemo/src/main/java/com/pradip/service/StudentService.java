package com.pradip.service;

import java.util.List;

import com.pradip.pojo.Student;

public interface StudentService {

	public List<Student> getAllStudent();

	public Student getStudent(Long id);
}
