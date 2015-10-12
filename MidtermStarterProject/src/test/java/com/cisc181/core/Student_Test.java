package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	private eMajor major;

	@BeforeClass 
	public static void setUpBefore() throws Exception { 
		
		ArrayList<Course> courses = new ArrayList<Course>();
		Course c1 = new Course(UUID.randomUUID(), "Calc A", 241);
		Course c2 = new Course(UUID.randomUUID(), "Calc B", 242);
		Course c3 = new Course(UUID.randomUUID(), "Calc C", 243);	 
	
		courses.add(c1);
		courses.add(c2);
		courses.add(c2);
		
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		Semester fall = new Semester(UUID.randomUUID(),(30,8,15),(20,12,15));
		Semester spring = new Semester(UUID.randomUUID(),(8,2,16),(15,5,16));
		
		semesters.add(spring);
		semesters.add(fall);
		
		ArrayList<Section> sections = new ArrayList<Section>();
		Section s1 = new Section(c1.CourseID(), spring.SemesterID(),UUID.randomUUID());
		Section s2 = new Section(c2.CourseID(), spring.SemesterID(),UUID.randomUUID());
		Section s3 = new Section(c3.CourseID(), spring.SemesterID(),UUID.randomUUID());
		Section s4 = new Section(c1.CourseID(), fall.SemesterID(),UUID.randomUUID());
		Section s5 = new Section(c2.CourseID(), fall.SemesterID(),UUID.randomUUID());
		Section s6 = new Section(c3.CourseID(), fall.SemesterID(),UUID.randomUUID());
		
		sections.add(s1);
		sections.add(s2);
		sections.add(s3);
		sections.add(s4);
		sections.add(s5);
		sections.add(s6);
	
	}

	@Test 
	public void changeMajor(){
		major = eMajor.PHYSICS;
	}
	
}
