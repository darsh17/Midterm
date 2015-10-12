package com.cisc181.core;
import java.util.Date;


public class Semester {
	
	private static int SemUUID;
	private Date start;
	private Date end;

	public void SetSemesterID(int SemUUID){
		Semester.SemUUID = SemUUID;
	}
	public static int SemesterID(){
		return SemUUID;
	}
	
	public void SetStartDate(Date start){
		this.start = start;
	}
	public Date StartDate(){
		return this.start;
	}
	
	public void SetEndDate(Date end){
		this.end = end;
	}
	public Date EndDate(){
		return this.end;
	}
	
}
