package com.shubham.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRestaurant {

	public static void main(String[] args) {


		//RestaurantService rst = new RestaurantService();


		//Starting IOC container
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring-beans.xml"); // To start IOC container for xml based
		//All constructors will be called for the specified bean in the xml file.

		//ApplicationContext ctxt = new AnnotationConfigApplicationContext(); // To start IOC container for annotation based


		//getBean method is used to call the methods and variables from the particular class which is specified as a bean.
		RestaurantService bean = ctxt.getBean(RestaurantService.class);

		bean.collectPayment(2400);
	
		 



	}

}
