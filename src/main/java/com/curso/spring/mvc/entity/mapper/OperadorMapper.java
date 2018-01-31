package com.curso.spring.mvc.entity.mapper;

import org.springframework.stereotype.Component;

import com.curso.spring.mvc.dto.OperadorDTO;
import com.curso.spring.persistencia.entity.Operador;

@Component
public class OperadorMapper implements ObjectMapper<Operador, OperadorDTO> {

	@Override
	public Operador DTOtoEntity(OperadorDTO dto) {
		Operador entity = new Operador();
		entity.setId(dto.getId());
		entity.setNombre(dto.getNombre());
		entity.setCif(dto.getCif());
		entity.setWeb(dto.getWeb());
		return entity;
	}

	@Override
	public OperadorDTO EntitytoDTO(Operador entity) {
		OperadorDTO dto = new OperadorDTO();
		dto.setId(entity.getId());
		dto.setNombre(entity.getNombre());
		dto.setCif(entity.getCif());
		dto.setWeb(entity.getWeb());
		return dto;
	}

}
