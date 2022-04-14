package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {

	public static void main(String[] args) {
	
			ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
			Person p=(Person)context.getBean("person");
			System.out.println("first name of the person is:"+p.getFirstName());
			Car c=(Car)context.getBean("car");
			System.out.println("the car model is :"+c.getModel());
			System.out.println("the car is from:"+c.getMake());
			System.out.println("the car is on:"+c.getYear());
			System.out.println("the car details are:"+p.getDetails());
			}


}
