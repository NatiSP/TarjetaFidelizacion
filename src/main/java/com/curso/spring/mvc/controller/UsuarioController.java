package com.curso.spring.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;

import com.curso.spring.mvc.dto.UsuarioDTO;
import com.curso.spring.mvc.service.interfaz.IUsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	
	@Autowired
	private IUsuarioService usuarioService;
	
	/**
	 * Metodo que busca un mensaje de bienvenida por su id y lo completa con la informacion del objeto Persona que recibe por parametro
	 * @param model
	 * @param persona
	 * @param id
	 * @return
	 */
	@RequestMapping(path = "/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public UsuarioDTO obtenerUsuario(Map<String, Object> model, @PathVariable int id) {
		return usuarioService.obtenerUsuario(id);
	}
}
