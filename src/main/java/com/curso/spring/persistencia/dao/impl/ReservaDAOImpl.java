package com.curso.spring.persistencia.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.curso.spring.persistencia.dao.ReservaDAO;
import com.curso.spring.persistencia.entity.Reserva;

@Repository
public class ReservaDAOImpl implements ReservaDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void insertarReserva(Reserva reserva) {
		em.persist(reserva);
		em.flush();
	}

	@Override
	public List<Reserva> buscarReservas(Reserva reserva) {
		// TODO Auto-generated method stub
		return null;
	}

}
