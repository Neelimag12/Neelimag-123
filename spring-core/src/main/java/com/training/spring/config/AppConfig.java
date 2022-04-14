package com.training.spring.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.bean.Car;
import com.training.spring.bean.Person;

@Configuration
public class AppConfig {
	
	@Bean("person")
	public Person getPerson() {

	 Person p= new Person();
	 p.setFirstName("neelu");
	return  p;
	}

	@Bean("car")
	public Car getCar() {

	Car c= new Car();
	c.setMake("Activa");
	c.setModel("accord");
	return c;
	}




}
