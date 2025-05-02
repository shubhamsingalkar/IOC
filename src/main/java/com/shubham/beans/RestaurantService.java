package com.shubham.beans;

public class RestaurantService {
	
	
	private IPayment iPayment;
	
	
	public RestaurantService() {
		
		System.out.println("Restaurant service 0-param constructor");
	}
	
	//Costructor injection and it is called by Constructor-arg tag in the xml config file
	public RestaurantService(IPayment iPayment){
		System.out.println("Restaurant service parameterized constructor");
		this.iPayment = iPayment;
	}
	
	
    //setter injection and it is called by property tag in the xml configuration
	public void setiPayment(IPayment iPayment) {
		System.out.println("Setter method called....");
		this.iPayment = iPayment;
	}
	/*
	 * In the XML based configuration only Constructor and Setter injection we
	 * can use , we can't use field injection.
	 * But in the annotation based configuration we can use all type of injection
	 */


	public void collectPayment(double amt) {
		
		boolean payBill = iPayment.payBill(amt);
		
		if(payBill) {
			
			System.out.println("$"+amt+ " Payment successful... Thank you");
		}
		
		else {
			
			System.out.println("Payment failed.....");
			
		}
		
		
	}

}
