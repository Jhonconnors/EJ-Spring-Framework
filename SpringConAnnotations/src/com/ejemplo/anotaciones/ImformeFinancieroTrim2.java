package com.ejemplo.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class ImformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion Informe Financiero Trimestre 2";
	}

	
}
