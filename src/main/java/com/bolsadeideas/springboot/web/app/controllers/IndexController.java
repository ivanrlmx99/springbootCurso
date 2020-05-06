package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuarios;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping(value = { "/index", "/", "/home" })
	public String Index(Model model) {
		model.addAttribute("titulo", "Hola spring desde controlador");

		return "index";
	}

	@RequestMapping("/perfil")
	public String metodoUsuario(Model model) {
		Usuarios user = new Usuarios();
		user.setNombre("Ivan");
		user.setApellido("Ramos");
		user.setEmail("ivanmx@gmail.com");

		model.addAttribute("user", user);
		model.addAttribute("titulo", "Perfil del usuario---->".concat(user.getNombre()));

		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listarUser(Model model) {
		List<Usuarios>usuarios=new ArrayList<>();
		model.addAttribute("titulo", "lista de usuarios");
		
		model.addAttribute("usuariosx", usuarios);
		
		
		return"listar";
	}

}
