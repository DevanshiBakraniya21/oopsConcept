package com.oppsConcept.inheritance.multiLevel;

public class School {

	private String sName;
	private String sCode;

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setsCode(String sCode) {
		this.sCode = sCode;
	}

	public String getsName() {
		return sName;
	}

	public String getsCode() {
		return sCode;
	}

	public void getSchoolDetails() {
		System.out.println("School Name: " + sName);
		System.out.println("School Code: " + sCode);
	}
}
