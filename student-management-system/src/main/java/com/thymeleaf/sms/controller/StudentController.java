package com.thymeleaf.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleaf.sms.model.Student;
import com.thymeleaf.sms.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
	model.addAttribute("students",studentService.getAllStudents());
	return "students";
	
	
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "create_student";
	}
	

}
