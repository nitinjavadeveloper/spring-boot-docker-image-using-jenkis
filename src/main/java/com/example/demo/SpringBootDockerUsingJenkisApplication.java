package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerUsingJenkisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerUsingJenkisApplication.class, args);
	}

	@RequestMapping("/spring-cicd-pipeline")
	public String hello() {
		return "This's the example of spring-boot docker image auto using ci/cd pipeline";
	}
}
