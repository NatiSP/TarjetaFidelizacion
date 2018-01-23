package com.curso.spring.mvc.service;

import org.springframework.stereotype.Service;

import com.curso.spring.mvc.dto.ClienteDTO;
import com.curso.spring.mvc.dto.OperadorDTO;
import com.curso.spring.mvc.dto.UsuarioDTO;
import com.curso.spring.mvc.service.interfaz.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService{

	public UsuarioDTO obtenerUsuario(int id) {
		UsuarioDTO resultado;
		if(id == 1) {
			resultado = new ClienteDTO();
		} else if (id == 2) {
			resultado = new OperadorDTO();
		} else {
			resultado = null;
		}
		
		return resultado;
	}
}
