package com.curso.spring.mvc.service;

import org.springframework.stereotype.Service;

import com.curso.spring.mvc.dto.ClienteDTO;
import com.curso.spring.mvc.dto.OperadorDTO;

@Service
public interface UsuarioService {

	public ClienteDTO obtenerCliente(String usuario);
	
	public OperadorDTO obtenerOperador(String usuario);
	
	public void altaCliente(ClienteDTO clienteNuevo);
	
	public void altaOperador(OperadorDTO operadorNuevo);

	public boolean doLogin(String usuario, String password);
}
