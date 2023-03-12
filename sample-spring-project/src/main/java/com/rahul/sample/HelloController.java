package com.rahul.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {  
	@RequestMapping("/hello")
	public String hello() {
		return "welcome to spring boot rest services";
	}
	
	

}
