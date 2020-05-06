package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuarios;


@Controller
@RequestMapping("/app")
public class IndexController {
	
	
	@GetMapping(value={"/index","/","/home"})
	public String Index(Model model) {
		model.addAttribute("titulo", "Hola spring desde controlador");
		
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String metodoTabla(Model model) {
		Usuarios user=new Usuarios();
		user.setNombre("Ivan");
		user.setApellido("Ramos");
		
		model.addAttribute("user",user);
		model.addAttribute("titulo", "Perfil del usuario---->".concat(user.getNombre()));
			
		
		return "perfil";
	}

}
