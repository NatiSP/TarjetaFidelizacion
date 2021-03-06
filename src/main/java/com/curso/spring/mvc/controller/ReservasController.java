package com.curso.spring.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.spring.mvc.dto.ClienteDTO;
import com.curso.spring.mvc.dto.MovimientoDTO;
import com.curso.spring.mvc.dto.OfertaDTO;
import com.curso.spring.mvc.dto.ReservaDTO;
import com.curso.spring.mvc.dto.TarjetaDTO;
import com.curso.spring.mvc.service.ReservasService;

@Controller
@RequestMapping("/reservas")
public class ReservasController {

	@Autowired
	private ReservasService reservasService;
	
	@RequestMapping(path="/realizar", method=RequestMethod.POST)
	public String realizarReserva(Map<String, Object> model, @RequestParam int idOferta, @RequestParam int idTarjeta) {
		OfertaDTO oferta = new OfertaDTO();
		oferta.setIdOferta(idOferta);
		TarjetaDTO tarjeta = new TarjetaDTO();
		tarjeta.setId(idTarjeta);
		reservasService.realizarReserva(oferta, tarjeta);
		return "vistaReserva";
	}
	
	@RequestMapping(path="/verReservas", method=RequestMethod.GET)
	public String verReservas(@RequestParam String idReserva) {
		ReservaDTO reservaCriteria = new ReservaDTO();
		MovimientoDTO movimientoCriteria = new MovimientoDTO();
		TarjetaDTO tarjetaCriteria = new TarjetaDTO();
		ClienteDTO clienteCriteria = new ClienteDTO();
		clienteCriteria.setId(idReserva);
		tarjetaCriteria.setCliente(clienteCriteria);
		movimientoCriteria.setTarjeta(tarjetaCriteria);
		reservaCriteria.setMovimientoAsociado(movimientoCriteria);
		
		reservasService.verListaReservas(reservaCriteria);
		return "vistaReserva";
	}
	
}
