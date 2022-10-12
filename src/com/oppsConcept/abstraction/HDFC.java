package com.oppsConcept.abstraction;

public class HDFC extends Bank{

	public HDFC() {
		super();
		System.out.println("In HDFC");
	}

	@Override
	public float intrestAmount(float intrest) {
		return intrest+0.04F;
	}

}
