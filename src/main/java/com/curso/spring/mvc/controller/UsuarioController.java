package com.curso.spring.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.curso.spring.mvc.dto.ClienteDTO;
import com.curso.spring.mvc.dto.OperadorDTO;
import com.curso.spring.mvc.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	
	private static final String DETALLE_USUARIO_VIEW = "detalleUsuario";
	@Autowired
	private UsuarioService usuarioService;
	
	/**
	 * Metodo que busca un mensaje de bienvenida por su id y lo completa con la informacion del objeto Persona que recibe por parametro
	 * @param model
	 * @param persona
	 * @param id
	 * @return
	 */
	@RequestMapping(path = "/cliente/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ClienteDTO obtenerClienteJSON(Map<String, Object> model, @PathVariable String id) {
		return usuarioService.obtenerCliente(id);
	}

	@RequestMapping(path = "/operador/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public OperadorDTO obtenerOperadorJSON(Map<String, Object> model, @PathVariable String id) {
		return usuarioService.obtenerOperador(id);
	}
	
	/**
	 * Metodo que busca un usuario por su id
	 * @param model
	 * @param persona
	 * @param id
	 * @return
	 */
	@RequestMapping(path = "/miPerfil", method = RequestMethod.GET)
	public String obtenerUsuarioMiPerfil(@SessionAttribute("loginData") String usuario, Map<String, Object> model) {
		model.put("usuario", usuarioService.obtenerCliente(usuario));
		return DETALLE_USUARIO_VIEW;
	}
}
