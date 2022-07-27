package com.ejemplo.anotaciones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseAnnotations2 {

	public static void main(String[] args) {


		// Leer el xml de Configuracion
		//ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Leer el class de Configuracion
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		
//		// Pedir un bean al contenedor
//		Empleados Antonio=contexto.getBean("ComercialExperimentado", Empleados.class);
//		Empleados Lucia=contexto.getBean("ComercialExperimentado", Empleados.class);
//		
//		// Prueba de ver si apuntan al mismo objeto de memoria
//		if (Antonio==Lucia) {
//			System.out.println("Apuntan al mismo lugar de memoria");
//			System.out.println(Antonio + "\n"+ Lucia);
//		}else {
//			System.out.println("No apuntan al mismo lugar enb memoria");
//			System.out.println(Antonio + "\n"+ Lucia);
//		}
//		
//		//Pedir un Bean ya definido en la clase EmpleadosConfig con ayuda de la anotacion @Bean
//		//En este caso el bean solicitado es de tipo Empleados
//		Empleados empleado=contexto.getBean("directorFinanciero", Empleados.class);
//		
//		System.out.println(empleado.getTareas());
//		System.out.println(empleado.getinformes());
//		
		DirectorFinanciero empleado=contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println("Email del director: "+empleado.getEmail());
		System.out.println("Nombre de la Empresa: "+empleado.getNombreEmpresa());
		
//		//cerrar el contexto
		
		
		contexto.close();

	}

}
