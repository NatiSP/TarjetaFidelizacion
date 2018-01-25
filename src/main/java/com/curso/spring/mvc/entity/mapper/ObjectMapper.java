package com.curso.spring.mvc.entity.mapper;

public interface ObjectMapper<Entity, DTO> {

	public Entity DTOtoEntity(DTO dto);
	
	public DTO EntitytoDTO(Entity entity);
}
