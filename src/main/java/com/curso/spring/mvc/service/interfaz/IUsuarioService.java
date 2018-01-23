package com.curso.spring.mvc.service.interfaz;

import org.springframework.stereotype.Service;

import com.curso.spring.mvc.dto.UsuarioDTO;

@Service
public interface IUsuarioService {

	public UsuarioDTO obtenerUsuario(int id);
}
