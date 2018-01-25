package com.curso.spring.mvc.service.impl;

import org.springframework.stereotype.Service;

import com.curso.spring.mvc.dto.ClienteDTO;
import com.curso.spring.mvc.dto.OperadorDTO;
import com.curso.spring.mvc.dto.UsuarioDTO;
import com.curso.spring.mvc.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

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
	
	public boolean doLogin(String usuario, String password) {
		return true;
	}

	@Override
	public UsuarioDTO altaCliente(ClienteDTO clienteNuevo) {
		UsuarioDTO resultado = null;
		return resultado;
	}

	@Override
	public UsuarioDTO altaOperador(OperadorDTO operadorNuevo) {
		UsuarioDTO resultado = null;
		return resultado;
	}
}
