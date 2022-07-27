package com.ejemplo.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		
		return "Aqui está el Informe del 3er Trimestre";
	}

}
