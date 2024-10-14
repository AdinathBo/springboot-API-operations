package com.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBoot {
	
	@GetMapping("/get")
	public String simple() {
		return "selenium";
	}
	
	@GetMapping("/get/v1")
	public String hello() {
		return "HelloWorld";
	}
	
	@GetMapping("/get/v2")
	public int addition() {
		return 5+17;
	}
	
	@GetMapping("/get/v3")
	public int subtraction() {
		return 20-8;
	}
	
	@GetMapping("/get/v4")
	public int multiplication() {
		return 8*5;
	}
	
	@GetMapping("/get/v5")
	public int square() {
		return 10*10;
	}
	
	@GetMapping("/get/v6")
	public int division() {
		return 40/5;
	}
}
