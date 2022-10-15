package com.oppsConcept.inheritance.multiLevel;

public class Student extends Classes{
	private String stName;
	private int sNo;
	
	public void setstName(String stName) {
		this.stName = stName;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public void getStudentDetails() {
		System.out.println("Student Name: " + stName);
		System.out.println("Student Number: " + sNo);
	}
	
	public void getAllDetails() {
		System.out.println("\n Student Section \n");
		System.out.println("School Name: " + getsName());
		System.out.println("School Code: " + getsCode());
		System.out.println("Standerd: " + getStnd());
		System.out.println("Class Number: " + getcNo());
		System.out.println("Class Teacher: "+ getcTeacher());
		System.out.println("Student Name: " + stName);
		System.out.println("Student Number: " + sNo);
	}
}
