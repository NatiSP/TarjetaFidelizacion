package com.curso.spring.persistencia.dao;

import java.util.List;

import com.curso.spring.persistencia.entity.Usuario;

public interface UsuarioDAO {

	public Long insertarUsuario(Usuario Usuario);
	
	public List<Usuario> buscarUsuarios(Usuario Usuario);
}
