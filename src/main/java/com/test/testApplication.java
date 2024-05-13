package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class testApplication {

	public static void main(String[] args) {
		SpringApplication.run(testApplication.class, args);
		System.out.println("done");
	}

}
