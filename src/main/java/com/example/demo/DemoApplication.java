package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
//	String index(){
//		return "Hello Spring Boot!";
//	}
}
