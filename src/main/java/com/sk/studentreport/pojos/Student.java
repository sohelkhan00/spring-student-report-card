package com.sk.studentreport.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	private Integer studentId;
	private String firstName;
	private String lastName;
	private byte grade;
	private byte maths;
	private byte socialStudies;
	private byte physics;
	private byte chemistry;
	private byte literature;
	private byte optionalSubjectMarks;
	private OptionalSubject optionalSubject;
	
	

	public Student(){
		super();
	}
	
	
	public Student(Integer studentId, String firstName, String lastName, byte grade, byte maths, byte socialStudies,
			byte physics, byte chemistry, byte literature, byte optionalSubjectMarks, OptionalSubject optionalSubject) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.maths = maths;
		this.socialStudies = socialStudies;
		this.physics = physics;
		this.chemistry = chemistry;
		this.literature = literature;
		this.optionalSubjectMarks = optionalSubjectMarks;
		this.optionalSubject = optionalSubject;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte getGrade() {
		return grade;
	}

	public void setGrade(byte grade) {
		this.grade = grade;
	}

	public byte getMaths() {
		return maths;
	}

	public void setMaths(byte maths) {
		this.maths = maths;
	}

	public byte getSocialStudies() {
		return socialStudies;
	}

	public void setSocialStudies(byte socialStudies) {
		this.socialStudies = socialStudies;
	}

	public byte getPhysics() {
		return physics;
	}

	public void setPhysics(byte physics) {
		this.physics = physics;
	}

	public byte getChemistry() {
		return chemistry;
	}

	public void setChemistry(byte chemistry) {
		this.chemistry = chemistry;
	}

	public byte getLiterature() {
		return literature;
	}

	public void setLiterature(byte literature) {
		this.literature = literature;
	}

	public byte getOptionalSubjectMarks() {
		return optionalSubjectMarks;
	}

	public void setOptionalSubjectMarks(byte optionalSubjectMarks) {
		this.optionalSubjectMarks = optionalSubjectMarks;
	}
	
	@ManyToOne // mandatory
	@JoinColumn(name = "optional_id")
	public OptionalSubject getOptionalSubject() {
		return optionalSubject;
	}

	public void setOptionalSubject(OptionalSubject optionalSubject) {
		this.optionalSubject = optionalSubject;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", grade="
				+ grade + ", maths=" + maths + ", socialStudies=" + socialStudies + ", physics=" + physics
				+ ", chemistry=" + chemistry + ", literature=" + literature + ", optionalSubjectMarks="
				+ optionalSubjectMarks + ", optionalSubject=" + optionalSubject + "]";
	}
	
}
