package com.curso.spring.persistencia.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.curso.spring.persistencia.dao.MovimientoDAO;
import com.curso.spring.persistencia.entity.Movimiento;

@Repository
public class MovimientoDAOImpl implements MovimientoDAO {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void insertarMovimiento(Movimiento movimiento) {
		em.persist(movimiento);
		em.flush();
	}

	@Override
	public List<Movimiento> buscarMovimientos(Movimiento movimiento) {
		Query query = em.createQuery("SELECT m FROM Movimientos m WHERE m.idMovimiento = :idMovimiento");
		query.setParameter(":idMovimiento", movimiento.getIdMovimiento());
		return query.getResultList();
	}
	
	@Override
	public List<Movimiento> buscarMovimientosUsuario(Movimiento movimiento) {
		Query query = em.createQuery("SELECT m FROM Movimientos m WHERE m.tarjeta.cliente.id = :idUsuario");
		query.setParameter(":idUsuario", movimiento.getTarjeta().getCliente().getId());
		return query.getResultList();
	}

}
