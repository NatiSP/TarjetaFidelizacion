package com.curso.spring.mvc.entity.mapper;

import com.curso.spring.mvc.dto.TarjetaDTO;
import com.curso.spring.mvc.entity.Tarjeta;

public class TarjetaMapper implements ObjectMapper<Tarjeta, TarjetaDTO> {

	@Override
	public Tarjeta DTOtoEntity(TarjetaDTO dto) {
		Tarjeta entity = new Tarjeta();
		entity.setId(dto.getId());
		entity.setNumeroTarjeta(dto.getNumeroTarjeta());
		entity.setCliente(new ClienteMapper().DTOtoEntity(dto.getCliente()));
		return entity;
	}

	@Override
	public TarjetaDTO EntitytoDTO(Tarjeta entity) {
		TarjetaDTO dto = new TarjetaDTO();
		dto.setId(entity.getId());
		dto.setNumeroTarjeta(entity.getNumeroTarjeta());
		dto.setCliente(new ClienteMapper().EntitytoDTO(entity.getCliente()));
		return dto;
	}
}
