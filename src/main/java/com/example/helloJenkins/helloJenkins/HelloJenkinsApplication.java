package com.example.helloJenkins.helloJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloJenkinsApplication {

	@GetMapping(value = "/")
	public String helloJenkins() {
		return "느어어어어엉";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloJenkinsApplication.class, args);
	}
}
