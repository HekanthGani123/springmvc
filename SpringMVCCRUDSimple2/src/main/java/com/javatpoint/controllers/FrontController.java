package com.javatpoint.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontController {
	
	@RequestMapping("/add")
	public String getAdd(@RequestParam("t1") String t1,@RequestParam("t2") String t2,Model m) {
		
		int n1 = Integer.parseInt(t1);
		int n2 = Integer.parseInt(t2);
		int n3=n1+n2;
		
		m.addAttribute("sum", n3);
		
		return "result";
	}

}
