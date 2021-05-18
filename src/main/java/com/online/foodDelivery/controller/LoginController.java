package com.online.foodDelivery.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@RequestMapping("user")
	
	public void checkLogin() {
		System.out.println("Inside User..."); 
		
	}
}
