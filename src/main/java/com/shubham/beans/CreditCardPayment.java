package com.shubham.beans;

public class CreditCardPayment implements IPayment {


	public CreditCardPayment() {
		
		System.out.println("Credit card constructor called...");
	}

	@Override
	public boolean payBill(double amt) {
		
		System.out.println("Credit Card payment is in progress....");
		
		return true;
	}

}
