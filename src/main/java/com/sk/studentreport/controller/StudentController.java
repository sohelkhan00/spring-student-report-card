package com.sk.studentreport.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sk.studentreport.dao.IStudentDao;
import com.sk.studentreport.dao.ISubjectDao;
import com.sk.studentreport.pojos.Student;
import com.sk.studentreport.service.StudentService;

@Controller()
public class StudentController {
	
	@Autowired
	IStudentDao studentDao;
	@Autowired
	private StudentService service;
	
	public StudentController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/")
    public String home() {
        System.out.println("Going home...");
        return "index";
    }
	
	@RequestMapping("/student-list")
	public String studentList(Model model)
	{
		List<Student> student = studentDao.findAll();
		model.addAttribute("students", student);
		return "student-list";
	}
	
	@GetMapping("/student")
	public String getStudent(@RequestParam int id, Model model) {
		
		System.out.println(id);
		Student stu = studentDao.findById(id).orElse(null);
		if(stu!=null) {
			Map<String, String> gradesMap = service.calculateGrade(stu);
			model.addAttribute("isHonor", true);
			for(Map.Entry<String, String> grade: gradesMap.entrySet()){
				if(grade.getValue() != "A" && grade.getValue() != "A+") {
					model.addAttribute("isHonor", false);
					break;
				}
			}
			model.addAttribute("student", stu);
			model.addAttribute("gradesMap", gradesMap);
		}else {
			System.out.println("id is null");
		}
		
		
		return "student-report";
	}
	
		
	@GetMapping("/add-student")
	public String addStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "AddStudent";
	}	
	
	@PostMapping("/register")
	public String postStudent(@ModelAttribute("student") Student student) {
		//System.out.println(student);
		student.getOptionalSubject();
		studentDao.save(student);
		return "register-success";
	}
}
