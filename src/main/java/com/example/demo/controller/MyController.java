package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String home()
	{
		return "Hello world";
	}
	
	@GetMapping("/one")
	public String one()
	{
		return "one";
	}

	@GetMapping("/two")
	public String two()
	{
		return "two";
	}
	
}
