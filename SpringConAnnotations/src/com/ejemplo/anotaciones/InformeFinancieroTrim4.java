package com.ejemplo.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Este es el 4to Trimestre de Informe Financiero";
	}

}
