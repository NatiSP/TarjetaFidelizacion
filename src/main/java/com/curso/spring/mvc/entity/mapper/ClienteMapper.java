package com.curso.spring.mvc.entity.mapper;

import com.curso.spring.mvc.dto.ClienteDTO;
import com.curso.spring.persistencia.entity.Cliente;

public class ClienteMapper implements ObjectMapper<Cliente, ClienteDTO>{

	@Override
	public Cliente DTOtoEntity(ClienteDTO dto) {
		Cliente entity = new Cliente();
		entity.setId(dto.getId());
		entity.setNombre(dto.getNombre());
		entity.setApellidos(dto.getApellidos());
		entity.setPuntos(dto.getPuntos());
		return entity;
	}
	

	@Override
	public ClienteDTO EntitytoDTO(Cliente entity) {
		ClienteDTO dto = new ClienteDTO();
		dto.setId(entity.getId());
		dto.setNombre(entity.getNombre());
		dto.setApellidos(entity.getApellidos());
		dto.setPuntos(entity.getPuntos());
		return dto;
	}
}
