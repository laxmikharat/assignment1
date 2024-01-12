package com.demo.ec2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ec2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ec2Application.class, args);
	}


	@GetMapping("/hello")
	public String helloWorld(){
		return "Hello World!!!";
	}

}
