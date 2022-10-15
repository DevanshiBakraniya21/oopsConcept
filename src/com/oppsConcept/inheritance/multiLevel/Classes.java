package com.oppsConcept.inheritance.multiLevel;

public class Classes extends School{
	private String stnd;
	private String cNo;
	private String cTeacher;
	
	public void setStnd(String stnd) {
		this.stnd = stnd;
	}

	public void setcNo(String cNo) {
		this.cNo = cNo;
	}

	public void setcTeacher(String cTeacher) {
		this.cTeacher = cTeacher;
	}

	public String getStnd() {
		return stnd;
	}

	public String getcNo() {
		return cNo;
	}

	public String getcTeacher() {
		return cTeacher;
	}

	public void getClassesDetail() {
		System.out.println("Standerd: " + stnd);
		System.out.println("Class Number: " + cNo);
		System.out.println("Class Teacher: "+ cTeacher);
	}
}
