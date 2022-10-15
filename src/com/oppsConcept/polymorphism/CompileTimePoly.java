package com.oppsConcept.polymorphism;

/**
 * here we see same method name with different method signature it is called method overloading
 * please refer shape class file
 * @author admin
 *
 */
public class CompileTimePoly {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.sum(4);
		s1.sum(3, 5.6f);
		s1.sum(5, 9);
	}
}
