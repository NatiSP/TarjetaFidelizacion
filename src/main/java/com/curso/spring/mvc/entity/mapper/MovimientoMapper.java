package com.curso.spring.mvc.entity.mapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.curso.spring.mvc.dto.MovimientoDTO;
import com.curso.spring.persistencia.entity.Movimiento;

public class MovimientoMapper implements ObjectMapper<Movimiento, MovimientoDTO>{

	@Autowired
	OperadorMapper operadorMapper;
	
	@Autowired
	TarjetaMapper tarjetaMapper;
	
	@Override
	public Movimiento DTOtoEntity(MovimientoDTO dto) {
		Movimiento entity = new Movimiento();
		entity.setIdMovimiento(dto.getIdMovimiento());
		entity.setFechaOperacion(dto.getFechaOperacion());
		entity.setDescripcion(dto.getDescripcion());
		entity.setCantidadPuntos(dto.getCantidadPuntos());
		entity.setOperador(operadorMapper.DTOtoEntity(dto.getOperador()));
		entity.setTarjeta(tarjetaMapper.DTOtoEntity(dto.getTarjeta()));
		return entity;
	}
	

	@Override
	public MovimientoDTO EntitytoDTO(Movimiento entity) {
		MovimientoDTO dto = new MovimientoDTO();
		dto.setIdMovimiento(entity.getIdMovimiento());
		dto.setFechaOperacion(entity.getFechaOperacion());
		dto.setDescripcion(entity.getDescripcion());
		dto.setCantidadPuntos(entity.getCantidadPuntos());
		dto.setOperador(operadorMapper.EntitytoDTO(entity.getOperador()));
		dto.setTarjeta(tarjetaMapper.EntitytoDTO(entity.getTarjeta()));
		return dto;
	}
}
