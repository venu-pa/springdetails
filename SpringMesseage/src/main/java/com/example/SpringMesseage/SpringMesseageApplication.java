package com.example.SpringMesseage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMesseageApplication {

	public static void main(String[] args) {
		System.out.println("entry");
		SpringApplication.run(SpringMesseageApplication.class, args);
		System.out.println("exit");
	}

}
