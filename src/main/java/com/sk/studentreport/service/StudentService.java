package com.sk.studentreport.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.studentreport.dao.ISubjectDao;
import com.sk.studentreport.pojos.Student;

@Service
public class StudentService {
	@Autowired
	ISubjectDao studentDao;
	
	public Map<String, String> calculateGrade(Student student) {
		Map<String, String> grades = new HashMap<>();
		
		Map<String, Byte> marksMap = new HashMap<>();
		
		marksMap.put("maths", student.getMaths());
		marksMap.put("socialstudies", student.getSocialStudies());
		marksMap.put("physics", student.getPhysics());
		marksMap.put("chemistry", student.getChemistry());
		marksMap.put("literature", student.getLiterature());
		marksMap.put("optional", student.getOptionalSubjectMarks());
		
		for(Map.Entry<String, Byte> subject: marksMap.entrySet()) {
			String subName = subject.getKey();
			int data = subject.getValue();
			String grade;
			if(data <= 63) {
				grade = "F";
				grades.put(subName, grade);
			}else if(data >=64 && data <= 69) {
				grade = "D";
				grades.put(subName, grade);
			}else if(data >= 70 && data <= 76) {
				grade = "C";
				grades.put(subName, grade);
			}
			else if(data >= 77 && data <= 79) {
				grade = "C+";	
				grades.put(subName, grade);
			}
			else if(data >= 80 && data <= 86) {
				grade = "B";
				grades.put(subName, grade);
			}else if(data >= 87 && data <= 89) {
				grade = "B+";
				grades.put(subName, grade);
			}else if(data >= 90 && data <= 97) {
				grade = "A";
				grades.put(subName, grade);
			}else if(data >= 98 && data <= 100) {
				grade = "A+";
				grades.put(subName, grade);
			}
			
		}
		
		return grades;
		
	}
	
	
}
