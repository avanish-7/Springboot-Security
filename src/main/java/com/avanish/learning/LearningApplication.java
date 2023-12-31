package com.avanish.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
		System.out.println("app started...");
	}

}
