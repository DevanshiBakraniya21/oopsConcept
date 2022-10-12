package com.oppsConcept.inheritance.singleLevel;

import java.math.BigDecimal;

/**
 * Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors 
 * of a parent object. It is an important part of OOPs
 * 
 * Single Inheritance: When a class inherits another class, it is known as a single inheritance. 
 * @author ADMIN
 */
public class Employee {
	private BigDecimal salary;
	private int role;
	
	
	public void getSalaryByRole(int role) {
		this.role = 1;
		setSalary();
		System.out.println(salary);
	}
	
	private void setSalary() {
		System.out.println(role);
		switch (role) {
		case 1: 
			salary = new BigDecimal("20000.20");
		case 2: 
			salary = new BigDecimal("40000.20");
		default:
			salary = new BigDecimal("10000.20");
			System.out.println("Unexpected value: " + role);
		}
	}
}
