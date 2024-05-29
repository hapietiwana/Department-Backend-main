package com.dailyCodeBuffer.Spring.boot.tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${welcome.message}")
	public String welcomeMessage;
	
	@GetMapping("/")
	public String helloWorld() {
		return welcomeMessage;
	}

}
