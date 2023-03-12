package com.rahul.sample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/methods1")
public class HelloController2 { 
	@GetMapping 
	public ResponseEntity<Sample> getMethod(){
		Sample sam = new Sample();
		sam.setMessage("this is form Sample class");
		return new ResponseEntity<Sample>(sam,HttpStatus.OK);
	}
	@PostMapping 
	public ResponseEntity<String> postMethod(){
		return new ResponseEntity<String>("this is ResponseEntity",HttpStatus.OK);
	}
	@PutMapping 
	public String putMethod() {
		return "This is put method"; 
		
	}
	@DeleteMapping 
	public String deleteMethod()
	{
		return "This is delete method";
		
	}

}
