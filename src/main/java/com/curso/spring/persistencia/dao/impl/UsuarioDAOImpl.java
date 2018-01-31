package com.curso.spring.persistencia.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.curso.spring.persistencia.dao.UsuarioDAO;
import com.curso.spring.persistencia.entity.Cliente;
import com.curso.spring.persistencia.entity.Login;
import com.curso.spring.persistencia.entity.Operador;
import com.curso.spring.persistencia.entity.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void insertarUsuario(Usuario usuario) {
		em.persist(usuario);
		em.flush();
	}

	@Override
	public List<Cliente> buscarClientes(Cliente cliente) {
		Query query = em.createQuery("SELECT c FROM Clientes c WHERE c.id = :idCliente");
		query.setParameter(":idCliente", cliente.getId());
		return query.getResultList();
	}
	
	@Override
	public List<Operador> buscarOperadores(Operador operador) {
		Query query = em.createQuery("SELECT o FROM Operadores o WHERE c.id = :idOperador");
		query.setParameter(":idOperador", operador.getId());
		return query.getResultList();
	}

	@Override
	public boolean loginUser(Login loginData) {
		Query query = em.createQuery("SELECT u FROM Usuarios u WHERE u.id = :id and u.password = :password");
		query.setParameter(":id", loginData.getUsuario());
		query.setParameter(":password", loginData.getPassword());
		Login login = (Login) query.getSingleResult();
		return login != null;
	}

}
