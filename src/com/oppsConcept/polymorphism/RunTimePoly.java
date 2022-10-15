package com.oppsConcept.polymorphism;

/**
 * here we use same method signature this is also called function overriding
 * 
 * upcasting: If the reference variable of Parent class refers to the object of Child class, it is known as upcasting
 * @author admin
 *
 */
public class RunTimePoly {

	public static void main(String[] args) {
		Shape s1;
		s1 = new Rectangle();
		s1.draw();
		
		s1 = new Circle();
		s1.draw();
		
		//upcasting[here Triangle class doesn't have draw method so we get main class result]
		s1 = new Triangle();
		s1.draw();
	}

}
