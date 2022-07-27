package com.ejemplo.anotaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
 * En esta Clase usamos anotaciones para sustituir la funcion del XML
*/

@Configuration
@ComponentScan("com.ejemplo.anotaciones")
//Anotacion para inyectar propiedades de un archivo externo
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	
	// Definir el bean para InformeFinancieroDtoCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { //Este será el id del bean inyectado
		
		return new InformeFinancieroDtoCompras();
	}
	
	
	
	// Definir el bean para DirectorFinanciero e Inyectar Dependencias
	
	@Bean
	public Empleados directorFinanciero() {
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
}
