package com.restdemo.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.dto.Users;

@RestController
public class HomeController {
	
//	@GetMapping("/add")
//	public int add(@RequestParam("a") int op1,@RequestParam("b") int op2) {
//		return op1 + op2;
//	}
//		
//		@GetMapping("/sub")
//		public int sub(@RequestParam("a") int op1,@RequestParam("b") int op2) {
//			return op1 - op2;
//		}
//			
//			@GetMapping("/multi")
//			public int multi(@RequestParam("a") int op1,@RequestParam("b") int op2) {
//				return op1 * op2;
//			}
//				
//				@GetMapping("/div/{a}/{b}")
//				public int div(@PathVariable("a") int op1,@PathVariable("b") int op2) {
//					return op1 / op2;
	
	@PostMapping("/save")
	public String saveUserData(@RequestBody Users users) {
		
		if(users.getUserName().equals("Dhanesh")) {
			return "valid user";
		}
	return "invalid user";
					
	}
}
