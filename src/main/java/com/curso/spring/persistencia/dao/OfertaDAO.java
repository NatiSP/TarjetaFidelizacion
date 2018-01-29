package com.curso.spring.persistencia.dao;

import java.util.List;

import com.curso.spring.persistencia.entity.Oferta;

public interface OfertaDAO {

	public Long insertarOferta(Oferta Oferta);
	
	public List<Oferta> buscarOfertas(Oferta Oferta);
}
