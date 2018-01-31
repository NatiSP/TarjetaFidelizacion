package com.curso.spring.persistencia.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.curso.spring.persistencia.dao.TarjetaDAO;
import com.curso.spring.persistencia.entity.Tarjeta;

@Repository
public class TarjetaDAOImpl implements TarjetaDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void insertarTarjeta(Tarjeta tarjeta) {
		em.persist(tarjeta);
		em.flush();
	}

	@Override
	public List<Tarjeta> buscarTarjetas(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

}
