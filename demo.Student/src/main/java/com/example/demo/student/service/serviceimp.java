package com.example.demo.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.student.model.Student;

@Service
public class serviceimp implements Service {
	
	
	@Autowired
	Student student;

	@Override
	public Student saveStudent(Student student) {

		return.saveStudent(student)
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(int id, Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	

}
