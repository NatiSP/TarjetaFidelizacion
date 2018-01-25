package com.curso.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.spring.mvc.service.UsuarioService;

@Controller
@RequestMapping("/login")
public class LoginController {

	private static final String LOGIN_VIEW = "login";
	private static final String INDEX_VIEW = "index";
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("/doLogin")
	public String doLogin (@RequestParam String usuario, @RequestParam String password) {
		if("".equals(usuario) || "".equals(password)) {
			return LOGIN_VIEW;
		}
		
		if(usuarioService.doLogin(usuario, password)) {
			return INDEX_VIEW;
		} else {
			return LOGIN_VIEW;
		}
	}
	
	@RequestMapping("/altaCliente")
	public String altaCliente() {
		
		return INDEX_VIEW;
	}
	
	@RequestMapping("/altaOperador")
	public String altaOperador() {
		
		return INDEX_VIEW;
	}
}
