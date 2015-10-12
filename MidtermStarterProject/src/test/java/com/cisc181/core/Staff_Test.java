package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class Staff_Test {

	ArrayList<Staff> staffers = new ArrayList<Staff>();
	
	@Before
	public void setUp() throws Exception {
		@SuppressWarnings("deprecation")
		Staff s1 = new Staff("Darsh", "D", "Patel", new Date(30,8,96), "Bethany Beach","3025558555",
				"cjn@gmail.com","5",5,2000, new Date(0), eTitle.DOCTOR);
		Staff s2 = new Staff("Darsh", "D", "Patel", new Date(30,8,96), "Bethany Beach","3025558555",
				"cjn@gmail.com","5",5,2500, new Date(0), eTitle.DOCTOR);
		Staff s3 = new Staff("Darsh", "D", "Patel", new Date(30,8,96), "Bethany Beach","3025558555",
				"cjn@gmail.com","5",5,3000, new Date(0), eTitle.DOCTOR);
		Staff s4 = new Staff("Darsh", "D", "Patel", new Date(30,8,96), "Bethany Beach","3025558555",
				"cjn@gmail.com","5",5,2400, new Date(0), eTitle.DOCTOR);
		Staff s5 = new Staff("Darsh", "D", "Patel", new Date(30,8,96), "Bethany Beach","3025558555",
				"cjn@gmail.com","5",5,2600, new Date(0), eTitle.DOCTOR);
		
		staffers.add(s1);
		staffers.add(s2);
		staffers.add(s3);
		staffers.add(s4);
		staffers.add(s5);
		
	}
	
	@Test
	public void AverageSalary(){
		double total = 0;
		double avg = 0;
		
		for(Staff staff : staffers){
			total += staff.getSalary();
		}
		
		avg = total/staffers.size();
		assertTrue(avg == 2500);
		
		System.out.println(total);
		System.out.println(avg);
		
	}
}
