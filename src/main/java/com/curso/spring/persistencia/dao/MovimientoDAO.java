package com.curso.spring.persistencia.dao;

import java.util.List;

import com.curso.spring.persistencia.entity.Movimiento;

public interface MovimientoDAO {

	public Long insertarMovimiento(Movimiento movimiento);
	
	public List<Movimiento> buscarMovimientos(Movimiento movimiento);
	
}
