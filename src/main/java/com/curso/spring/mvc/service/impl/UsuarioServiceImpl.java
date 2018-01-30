package com.curso.spring.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.mvc.dto.ClienteDTO;
import com.curso.spring.mvc.dto.OperadorDTO;
import com.curso.spring.mvc.dto.UsuarioDTO;
import com.curso.spring.mvc.entity.mapper.ClienteMapper;
import com.curso.spring.mvc.entity.mapper.OperadorMapper;
import com.curso.spring.mvc.service.UsuarioService;
import com.curso.spring.persistencia.dao.UsuarioDAO;
import com.curso.spring.persistencia.entity.Cliente;
import com.curso.spring.persistencia.entity.Login;
import com.curso.spring.persistencia.entity.Operador;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioDAO usuarioDao;
	
	@Autowired
	private ClienteMapper clienteMapper;
	@Autowired
	private OperadorMapper operadorMapper;
	
	public ClienteDTO obtenerCliente(String id) {
		Cliente usuario = new Cliente(id); 
		Cliente clienteConsulta = usuarioDao.buscarClientes(usuario).get(0);
		
		ClienteDTO resultado = clienteMapper.EntitytoDTO(clienteConsulta);
		return resultado;
	}
	
	public OperadorDTO obtenerOperador(String id) {
		Operador usuario = new Operador(id); 
		Operador operadorConsulta = usuarioDao.buscarOperadores(usuario).get(0);
		
		OperadorDTO resultado = operadorMapper.EntitytoDTO(operadorConsulta);
		return resultado;
	}
	
	public boolean doLogin(String usuario, String password) {
		Login loginData = new Login(usuario, password);
		return usuarioDao.loginUser(loginData);
	}

	@Override
	public void altaCliente(ClienteDTO clienteNuevo) {
		usuarioDao.insertarUsuario(clienteMapper.DTOtoEntity(clienteNuevo));
		return;
	}

	@Override
	public void altaOperador(OperadorDTO operadorNuevo) {
		usuarioDao.insertarUsuario(operadorMapper.DTOtoEntity(operadorNuevo));
		return;
	}

}
