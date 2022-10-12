package com.oppsConcept.inheritance.singleLevel;

public class Developer extends Employee{
	
	public void getDetails(String name,String project,int exp) {
		System.out.println("Name :"+name);
		System.out.println("Project List:" + project);
		System.err.println("experience :"+exp);
	}
	
	
	
}
