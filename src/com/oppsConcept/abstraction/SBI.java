package com.oppsConcept.abstraction;

public class SBI extends Bank{
	public SBI() {
		super();
		System.out.println("In SBI");
		
	}
	
	@Override
	public float intrestAmount(float intrest) {
		return intrest+1;
	}

}
