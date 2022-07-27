package com.ejemplo.anotaciones;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
//@Scope("prototype") //prototype no es compatible con PreConstruct ó PreDestroy
public class ComercialExperimentado implements Empleados {

	// Ejecucion de Codigo Despues de Creacion del Bean
	
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras creacion de Bean");
	}
	
	// Ejecucion de codigo Despues de apagado el contenedor
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes de Destruccion");
	}
	
	public ComercialExperimentado() {
		
	}
	
	
//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	
//	@Autowired
//	public void queMasDaElNombre(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	
	
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, Vender y Vender mas";
	}


	@Override
	public String getinformes() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}

	@Autowired
	@Qualifier("informeFinancieroTrim4")	// bean id que debe utilizar
	private CreacionInformeFinanciero nuevoInforme;
}
