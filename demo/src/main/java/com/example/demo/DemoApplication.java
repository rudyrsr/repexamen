package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("hola mundo");

		System.out.println("hola ");
		System.out.println("mundo");
		SpringApplication.run(DemoApplication.class, args);
	}
}
