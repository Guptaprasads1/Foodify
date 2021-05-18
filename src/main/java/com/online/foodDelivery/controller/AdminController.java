package com.online.foodDelivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
	
	@GetMapping("/admin")
	public String adminHome() {
		return "adminHome";
	}
	@GetMapping("/admin/ownerList")
	public String ownerList() {
		return "ownerList";
	}
//	@GetMapping("/admin/ownerList")
//	public String addOwner() {
//		return "addOwner";
//	}
}
