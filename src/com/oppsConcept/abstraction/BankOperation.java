package com.oppsConcept.abstraction;

import java.math.BigDecimal;

public class BankOperation {

	public static void main(String[] args) {
		System.out.println("Welcome to Bank");
		Bank b1= new SBI();
		Float rate=b1.intrestAmount(7.3F);
		System.out.println("SBI bank rate:"+rate);
		BigDecimal emiAmount= b1.emiAmount(new BigDecimal("200000"),rate, 23);
		System.out.println("SBI Emi Cost:"+emiAmount);
		
		Bank b2= new HDFC();
		Float rate1=b2.intrestAmount(5.3F);
		System.out.println("HDFC bank rate:"+rate1);
		BigDecimal emiAmount1= b2.emiAmount(new BigDecimal("400000"),rate1, 45);
		System.out.println("HDFC Emi Cost:"+emiAmount1);
		 
	}
}
