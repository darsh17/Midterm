package com.cisc181.core;

import java.util.UUID;

public class Section {

	private int CouUUID;
	private int SemUUID;
	private static int SecUUID;
	private int room;
	
	public Section(int courseID, int semesterID, UUID randomUUID) {
	
	}
	public void CourseId(int CouUUID){
		this.CouUUID = CouUUID;
	}
	public int CourseID(){
		return this.CouUUID;
	}
	
	public void SetSemesterId(int SemUUID){
		this.SemUUID = SemUUID;
	}
	public int SemesterID(){
		return this.SemUUID;
	}
	
	public void SetSectionId(int SecUUID){
		Section.SecUUID = SecUUID;
	}
	public static int SectionID(){
		return SecUUID;
	}
	
	public void RoomID(int room){
		this.room = room;
	}
	public int RoomID(){
		return this.room;
	}
	
	
}
