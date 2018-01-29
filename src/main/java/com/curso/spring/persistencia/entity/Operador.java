package com.curso.spring.persistencia.entity;

import javax.persistence.Entity;

@Entity
public class Operador extends Usuario{

	private String cif;
	private String web;
	private Double factorConversion;
	
	public Operador() {
		super();
		this.cif = "123";
		this.web = "blablabla.com";
		this.factorConversion = 1.0;
	}
	
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public Double getFactorConversion() {
		return factorConversion;
	}
	public void setFactorConversion(Double factorConversion) {
		this.factorConversion = factorConversion;
	}
}
