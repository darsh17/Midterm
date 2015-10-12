package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	
	private int CouUUID;
	private String name;
	private int grade;
	private eMajor Major;
	
	public Course(UUID randomUUID, String string, int i) {
		
	}
	public void SetCourseID(int CouUUID){
		this.CouUUID = CouUUID;
	}
	public int CourseID(){
		return this.CouUUID;
	}
	
	public void CourseName(String name){
		this.name = name;
	}
	public String CourseName(){
		return this.name;
	}
	
	public void SetGradePoint(int grade){
		this.grade = grade;
	}
	public int GradePoint(){
		return this.grade;
	}
	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor major) {
		this.Major = major;
	}
	
}
