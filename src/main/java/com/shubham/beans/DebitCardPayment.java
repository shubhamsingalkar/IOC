package com.shubham.beans;

public class DebitCardPayment implements IPayment{

	
	
	public DebitCardPayment() {
		
		
		
		System.out.println("Debit card constructor called...");
	}

	@Override
	public boolean payBill(double amt) {
		
		
		System.out.println("Debit Card payment is processing.....");
		
		return true;
	}
	
	
	

}
