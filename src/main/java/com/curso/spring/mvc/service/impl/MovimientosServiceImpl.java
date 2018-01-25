package com.curso.spring.mvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.spring.mvc.dto.MovimientoDTO;
import com.curso.spring.mvc.dto.UsuarioDTO;
import com.curso.spring.mvc.service.MovimientosService;

@Service
public class MovimientosServiceImpl implements MovimientosService{

	@Override
	public List<MovimientoDTO> verMovimientos(UsuarioDTO usuario) {
		List<MovimientoDTO> listaMovimientos = new ArrayList<MovimientoDTO>();
		listaMovimientos.add(new MovimientoDTO());
		return listaMovimientos;
	}

	@Override
	public MovimientoDTO realizarMovimiento(MovimientoDTO movimiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovimientoDTO detalleMovimiento(MovimientoDTO movimiento) {
		return new MovimientoDTO();
	}
}
