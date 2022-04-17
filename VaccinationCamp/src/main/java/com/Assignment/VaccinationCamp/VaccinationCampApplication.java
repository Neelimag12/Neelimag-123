package com.Assignment.VaccinationCamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VaccinationCampApplication extends SpringBootServletInitializer {
	
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(VaccinationCampApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(VaccinationCampApplication.class, args);
	}

}
