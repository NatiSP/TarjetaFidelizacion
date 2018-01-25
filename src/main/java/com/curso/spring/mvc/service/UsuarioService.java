package com.curso.spring.mvc.service;

import org.springframework.stereotype.Service;

import com.curso.spring.mvc.dto.ClienteDTO;
import com.curso.spring.mvc.dto.OperadorDTO;
import com.curso.spring.mvc.dto.UsuarioDTO;

@Service
public interface UsuarioService {

	public UsuarioDTO obtenerUsuario(int id);

	public boolean doLogin(String usuario, String password);
	
	public UsuarioDTO altaCliente(ClienteDTO clienteNuevo);
	
	public UsuarioDTO altaOperador(OperadorDTO operadorNuevo);
}
