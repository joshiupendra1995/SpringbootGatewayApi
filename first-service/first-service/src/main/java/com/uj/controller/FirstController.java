package com.uj.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class FirstController {
	
 @GetMapping("/message")
	public String test() {
		return "Hello UJ Called in First Service";
	}
}
