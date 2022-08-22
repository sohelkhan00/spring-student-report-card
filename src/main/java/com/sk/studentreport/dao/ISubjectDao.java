package com.sk.studentreport.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.studentreport.pojos.OptionalSubject;

public interface ISubjectDao extends JpaRepository<OptionalSubject, Integer>{
	
}
