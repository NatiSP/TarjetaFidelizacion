package com.curso.spring.mvc.service;

import java.util.List;

import com.curso.spring.mvc.dto.MovimientoDTO;
import com.curso.spring.mvc.dto.UsuarioDTO;

public interface MovimientosService {

	public List<MovimientoDTO> verMovimientos(UsuarioDTO usuario);
	
	public MovimientoDTO realizarMovimiento(MovimientoDTO movimiento);
	
	public MovimientoDTO detalleMovimiento(MovimientoDTO movimiento);
}
