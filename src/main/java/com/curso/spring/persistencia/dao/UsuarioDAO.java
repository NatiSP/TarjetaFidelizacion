package com.curso.spring.persistencia.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.curso.spring.persistencia.entity.Cliente;
import com.curso.spring.persistencia.entity.Login;
import com.curso.spring.persistencia.entity.Operador;
import com.curso.spring.persistencia.entity.Usuario;

@Repository
public interface UsuarioDAO {

	public void insertarUsuario(Usuario usuario);
	
	public List<Cliente> buscarClientes(Cliente usuario);
	
	public List<Operador> buscarOperadores(Operador usuario);
	
	public boolean loginUser(Login loginData);
}
