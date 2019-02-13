package com.usecasebanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.usecasebanking")
@SpringBootApplication
public class UsecasebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsecasebankingApplication.class, args);
	}

}

