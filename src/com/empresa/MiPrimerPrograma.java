package com.empresa;

public class MiPrimerPrograma {

	public static String saludo()
	{
	     return "Hola mundo!";	
	}
	
	public static void main(String[] args) {
		System.out.print("Este es mi segundo programa:  ");
		
		String mensaje = saludo();
		System.out.print(mensaje);
	}

}
