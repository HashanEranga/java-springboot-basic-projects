package com.hashan.javspringbasics.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		// creating an application context that handles the beans
		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);

	}

}
