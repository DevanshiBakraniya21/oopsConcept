package com.oppsConcept.inheritance.singleLevel;

public class SingleInheritenceMain {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.getSalaryByRole(2);
		
		/*
		 * Developer d1 = (Developer) new Employee(); d1.getSalaryByRole(1);
		 * d1.getDetails("devu", "banking", 3);
		 * 
		 * Employee e2 = new Developer(); e2.getSalaryByRole(2);
		 */
	}
}
