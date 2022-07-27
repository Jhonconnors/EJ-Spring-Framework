package com.ejemplo.anotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Leer el xml de Configuracion
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir un bean al contenedor
		Empleados Antonio=contexto.getBean("ComercialExperimentado", Empleados.class);
		
		// usar el bean
		System.out.println(Antonio.getinformes());
		System.out.println(Antonio.getTareas());
		
		//cerrar el contexto
		contexto.close();
	}

}
