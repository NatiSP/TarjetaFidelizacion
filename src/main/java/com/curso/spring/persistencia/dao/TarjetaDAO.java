package com.curso.spring.persistencia.dao;

import java.util.List;

import com.curso.spring.persistencia.entity.Tarjeta;

public interface TarjetaDAO {

	public void insertarTarjeta(Tarjeta tarjeta);
	
	public List<Tarjeta> buscarTarjetas(Tarjeta tarjeta);
}
