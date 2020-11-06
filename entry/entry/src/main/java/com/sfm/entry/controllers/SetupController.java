package com.sfm.entry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SetupController {

	@GetMapping("/")
	public String index()
	{
		return "/home";
	} 
	
	@GetMapping("/welcome")
	public String home()
	{
		return "/home";
	}
}
