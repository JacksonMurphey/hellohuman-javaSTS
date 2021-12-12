package com.jmurphey.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class Name {

	
//	@RequestMapping("")
//	public String index() {
//		return "Hello Human";
//	}
	
	
	
//	@RequestMapping("")
//	public String start(@RequestParam(value="name", required=false) String query) {
//		if(query != null ) {
//			return "Hello " + query; }
//		else { return "Hello Human";}
//		
//	}
	
	
	@RequestMapping("/")
	public String start(@RequestParam(value="name", required=false, defaultValue="Human") String name, Model model) {
		model.addAttribute("name", name);
		return "index.jsp";
		
	}
	
	
	
}
