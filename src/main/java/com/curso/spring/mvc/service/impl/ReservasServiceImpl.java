package com.curso.spring.mvc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.mvc.dto.OfertaDTO;
import com.curso.spring.mvc.dto.ReservaDTO;
import com.curso.spring.mvc.dto.TarjetaDTO;
import com.curso.spring.mvc.entity.mapper.OperadorMapper;
import com.curso.spring.mvc.entity.mapper.TarjetaMapper;
import com.curso.spring.mvc.service.ReservasService;
import com.curso.spring.persistencia.entity.Movimiento;

@Service
public class ReservasServiceImpl implements ReservasService{

	@Autowired
	TarjetaMapper tarjetaMapper;
	
	@Autowired
	OperadorMapper operadorMapper;
	
	@Override
	public ReservaDTO verReserva(ReservaDTO reservaCriteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservaDTO> verListaReservas(ReservaDTO reservaCriteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void realizarReserva(OfertaDTO oferta, TarjetaDTO tarjeta) {
		Movimiento movimiento = new Movimiento();
		movimiento.setTarjeta(tarjetaMapper.DTOtoEntity(tarjeta));
		movimiento.setOperador(operadorMapper.DTOtoEntity((oferta.getOperador())));
		movimiento.setFechaOperacion(new Date());
	}

}
