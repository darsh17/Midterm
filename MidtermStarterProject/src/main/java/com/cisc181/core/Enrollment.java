package com.cisc181.core;

public class Enrollment {
	
	private int SecUUID = Section.SectionID();
	private int SemUUID = Semester.SemesterID();
	private int EnrUUID;
	private double Grade;

	private Enrollment() {
	}
	
	public void setEnrollmentID(int StudentID, int SectionID, int EnrUUID){
		this.setEnrUUID(EnrUUID);
	}
	
	public void SetSectionId(int SecUUID){
		this.SecUUID = SecUUID;
	}
	public int SectionID(){
		return this.SecUUID;
	}
	
	public int getSemUUID() {
		return SemUUID;
	}
	public void setSemUUID(int semUUID) {
		SemUUID = semUUID;
	}
	
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}

	public int getEnrUUID() {
		return EnrUUID;
	}

	public void setEnrUUID(int enrUUID) {
		EnrUUID = enrUUID;
	}
	

}
