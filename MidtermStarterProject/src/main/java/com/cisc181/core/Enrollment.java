package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		
		
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
	
	Enrollment( double newGrade) {
		Grade = newGrade;
	}

	private void setgrade(double newGrade) {
		Grade = newGrade;
	
	}
	
	

}
