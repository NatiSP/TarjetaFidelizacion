package com.curso.spring.mvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.mvc.dto.MovimientoDTO;
import com.curso.spring.mvc.dto.UsuarioDTO;
import com.curso.spring.mvc.entity.mapper.MovimientoMapper;
import com.curso.spring.mvc.service.MovimientosService;
import com.curso.spring.persistencia.dao.MovimientoDAO;
import com.curso.spring.persistencia.entity.Movimiento;
import com.curso.spring.persistencia.entity.Tarjeta;

@Service
public class MovimientosServiceImpl implements MovimientosService{

	@Autowired
	MovimientoDAO movimientoDAO;
	
	@Autowired
	MovimientoMapper movimientoMapper;
	
	@Override
	public List<MovimientoDTO> verMovimientos(MovimientoDTO movimiento) {
		List<MovimientoDTO> listaResultados = new ArrayList<MovimientoDTO>();	
		List<Movimiento> listaMovimientos = movimientoDAO.buscarMovimientos(movimientoMapper.DTOtoEntity(movimiento));
		for (int i = 0; i < listaMovimientos.size(); i++) {
			listaResultados.add(movimientoMapper.EntitytoDTO(listaMovimientos.get(i)));
		}
		return listaResultados;
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
