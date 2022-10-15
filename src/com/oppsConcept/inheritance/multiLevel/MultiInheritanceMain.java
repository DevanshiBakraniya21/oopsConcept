package com.oppsConcept.inheritance.multiLevel;

public class MultiInheritanceMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.setsName("Doon Inte. School");
		s.setsCode("1");
		
		s.setStnd("11");
		s.setcNo("1");
		s.setcTeacher("ABC");
		
		s.setsNo(1);
		s.setstName("Admin");
		
		//with different methods
		s.getSchoolDetails();
		s.getClassesDetail();
		s.getStudentDetails();
		
		//with only one method
		s.getAllDetails();
		
	}

}
