package com.oppsConcept.polymorphism;

/**
 * Polymorphism : It is one type of method which is represented by more than one form.
 * ~ It allow us to create method with same name and different method signature.
 * 
 * Let see in This Example
 * @author Admin
 *
 */
public class Shape {
	public void draw() {
		System.out.println("Draw From Main Method");
	}
	
	public void sum(int r) {
		System.out.println("Circle: " + (3.14 * r * r));
	}
	
	public void sum(int l,int w) {
		System.out.println("Rectangle: " + (l * w));
	}
	
	public void sum(int h,float b) {
		System.out.println("Triangle: " + (h*b)/2);
	}
}


