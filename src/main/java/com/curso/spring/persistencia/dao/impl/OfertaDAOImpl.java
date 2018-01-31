package com.curso.spring.persistencia.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.curso.spring.persistencia.dao.OfertaDAO;
import com.curso.spring.persistencia.entity.Oferta;

@Repository
public class OfertaDAOImpl implements OfertaDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void insertarOferta(Oferta oferta) {
		em.persist(oferta);
		em.flush();
	}

	@Override
	public List<Oferta> buscarOfertas(Oferta oferta) {
		// TODO Auto-generated method stub
		return null;
	}

}
