package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Usuario;

@Controller
@RequestMapping("/app")
public class HomeController {
	
	//@RequestMapping(value="/index",method=RequestMethod.GET)
   @GetMapping(value="/index")
	public String index(Map<String,Object> model) {
	   model.put("titulo", "Hola Mundo");
		return "index";
	}
   
   @RequestMapping("/perfil")
   public String perfil(Model model) {
	   
	   Usuario usuario = new Usuario();
	   usuario.setNombre("Miguel");
	   usuario.setApellido("Espinoza");
	   model.addAttribute("perfil", "usuario");
	   return "perfil";
   }

}
