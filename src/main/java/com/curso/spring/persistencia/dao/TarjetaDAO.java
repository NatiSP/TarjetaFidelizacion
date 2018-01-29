package com.curso.spring.persistencia.dao;

import java.util.List;

import com.curso.spring.persistencia.entity.Tarjeta;

public interface TarjetaDAO {

	public Long insertarTarjeta(Tarjeta Tarjeta);
	
	public List<Tarjeta> buscarTarjetas(Tarjeta Tarjeta);
}
