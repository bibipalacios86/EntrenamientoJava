package com.empresa;

public class SwitchCase {

	public static void main(String[] args) {
		string modulo="Contabilidad";
		
		switch(modulo)
		{
		case "Contabilidad":
			System.out.print("Ingreso al módulo de Contabilidad");
			break;
		
		case "Presupuesto":
			System.out.print("Ingreso al módulo de Presupuesto");
			break;
			
		case "Tesoreria":
			System.out.print("Ingreso al módulo de Tesoreria");
			break;
			
		case "Nómina":
			System.out.print("Ingreso al módulo de Nómina");
			break;
			
		case "Inventarios":
			System.out.print("Ingreso al módulo de Inventarios");
			break;	
			
		case "Industria y Comercio":
			System.out.print("Ingreso al módulo de Industria y Comercio");
			break;	
			
		case "Predial":
			System.out.print("Ingreso al módulo de Predial");
			break;	
			
		default:
			System.out.print("Regrese a la página y escoja un módulo");
		
		}
		}

	}


