package com.sk.studentreport.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class OptionalSubject {
	
	private Integer optionalSubjectID;
	private String optionalSubjectName;
	private List<Student> students = new ArrayList<>();
	
	public OptionalSubject() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	public OptionalSubject(Integer optionalSubjectID, String optionalSubjectName) {
		this.optionalSubjectID = optionalSubjectID;
		this.optionalSubjectName = optionalSubjectName;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "optional_id")
	public Integer getOptionalSubjectID() {
		return optionalSubjectID;
	}


	public void setOptionalSubjectID(Integer optionalSubjectID) {
		this.optionalSubjectID = optionalSubjectID;
	}



	public String getOptionalSubjectName() {
		return optionalSubjectName;
	}



	public void setOptionalSubjectName(String optionalSubjectName) {
		this.optionalSubjectName = optionalSubjectName;
	}


	@Override
	public String toString() {
		return "OptionalSubject [optionalSubjectID=" + optionalSubjectID + ", optionalSubjectName="
				+ optionalSubjectName + "]";
	}


	@OneToMany(mappedBy = "optionalSubject", cascade = CascadeType.ALL/* ,fetch = FetchType.EAGER */, orphanRemoval = true)
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	// write a helper method to add student dtls to course & vice versa
	public void addStudent(Student s) {
		students.add(s);// course ---> student
		s.setOptionalSubject(this); // student ---> course
	}

	// write a helper method to remove student dtls from course & vice versa
	public void removeStudent(Student s) {
		students.remove(s);// course -X-> student
		s.setOptionalSubject(null);// student --X-> course
	}
}
