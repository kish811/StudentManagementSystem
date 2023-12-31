package com.thymeleaf.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thymeleaf.sms.model.Student;
import com.thymeleaf.sms.repository.StudentRepository;
import com.thymeleaf.sms.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	@Override
	public List<Student> getAllStudents() {
	
		return studentRepository.findAll();
	}
	
	
	

}
