package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/app")
public class IndexController {
	
	
	@GetMapping(value={"/index","/","/home"})
	public String Index(Model model) {
		model.addAttribute("titulo", "Hola spring desde controlador");
		
		return "index";
	}

}
