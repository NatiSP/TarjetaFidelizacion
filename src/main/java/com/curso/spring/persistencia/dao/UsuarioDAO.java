package com.curso.spring.persistencia.dao;

import java.util.List;

import com.curso.spring.persistencia.entity.Cliente;
import com.curso.spring.persistencia.entity.Login;
import com.curso.spring.persistencia.entity.Operador;
import com.curso.spring.persistencia.entity.Usuario;

public interface UsuarioDAO {

	public void insertarUsuario(Usuario usuario);
	
	public List<Cliente> buscarClientes(Cliente usuario);
	
	public List<Operador> buscarOperadores(Operador usuario);
	
	public boolean loginUser(Login loginData);
}
