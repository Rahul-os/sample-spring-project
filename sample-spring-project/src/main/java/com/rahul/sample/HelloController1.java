package com.rahul.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//example 2 for using get and post methods by adding spring-boot-devtools dependency
//by default get method is called and to use post method also we have to pass the url in the postman 
@RestController
@RequestMapping("/methods")
public class HelloController1 { 
	
	@GetMapping
	public String getMethod() {
		return "this is getMethod";
	}
	@PostMapping 
	public String postMethod() {
		return "this is post method";
	}

}
