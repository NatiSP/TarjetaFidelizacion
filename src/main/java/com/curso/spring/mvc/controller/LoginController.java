package com.curso.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.curso.spring.mvc.dto.LoginData;
import com.curso.spring.mvc.service.UsuarioService;

@Controller
@RequestMapping("/login")
@SessionAttributes("loginData")
public class LoginController {

	private static final String LOGIN_VIEW = "login";
	private static final String INDEX_VIEW = "index";
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping()
	public String login(Model model) {
		LoginData loginData = new LoginData("", "");
		model.addAttribute("loginData", loginData);
		return LOGIN_VIEW;
	}
	
	@RequestMapping("/doLogin")
	public String doLogin (@RequestParam String usuario, @RequestParam String password, Model model) {
		if("".equals(usuario) || "".equals(password)) {
			model.addAttribute("error", "Rellene los campos");
			return LOGIN_VIEW;
		}
		
		if(usuarioService.doLogin(usuario, password)) {
			model.addAttribute("loginData", usuario);
			return INDEX_VIEW;
		} else {
			model.addAttribute("error", "Usuario/Password incorrectos");
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
