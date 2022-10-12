package com.oppsConcept.abstraction;

import java.math.BigDecimal;

/*Abstract Class: 
 * 	Abstraction is a process of hiding the implementation details and showing only functionality to the user.
	Another way, it shows only essential things to the user and hides the internal details.
	* Abstract class can have abstract and non-abstract methods.
	* Abstract class have constructor.
	let's see in this example.. 
*/
abstract class Bank {
	

	public Bank() {
		System.out.println("In Bank class");
	}
	
	public abstract float intrestAmount(float intrest);
	public  BigDecimal emiAmount(BigDecimal amount,float intrest,int month) {
		//float emi = amount*(intrest)*(1+intrest)*month/((1 + intrest)*month - 1);
		BigDecimal intrest1 = BigDecimal.ZERO;
		BigDecimal month1 = BigDecimal.ZERO;
		BigDecimal one = BigDecimal.ONE;
		return amount.multiply(intrest1).multiply(one.add(intrest1)).multiply(month1).divide(one.add(intrest1)).multiply(month1).subtract(one);
		
	}
}
