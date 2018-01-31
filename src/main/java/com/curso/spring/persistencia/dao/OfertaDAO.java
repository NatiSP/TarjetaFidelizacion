package com.curso.spring.persistencia.dao;

import java.util.List;

import com.curso.spring.persistencia.entity.Oferta;

public interface OfertaDAO {

	public void insertarOferta(Oferta oferta);
	
	public List<Oferta> buscarOfertas(Oferta oferta);
}
