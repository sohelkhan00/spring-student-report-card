package com.sk.studentreport.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sk.studentreport.pojos.OptionalSubject;
import com.sk.studentreport.pojos.Student;


public interface IStudentDao extends JpaRepository<Student, Integer> {
	
}
