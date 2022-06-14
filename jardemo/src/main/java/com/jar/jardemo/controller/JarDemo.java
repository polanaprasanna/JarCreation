package com.jar.jardemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class JarDemo {
	
	@GetMapping("/get/{no}")
	public String getName(@PathVariable int no) {
		return "sathish "+no;
	}

}
