package com.empresa;

public class VariableDeInstancia {
 String nombre;
 
  void mostrarNombre()
  {
	System.out.print("Nombre: "+nombre);	
  }
	public static void main(String[] args) {
		VariableDeInstancia p1 = new VariableDeInstancia();
		p1.nombre = "Bibiana";
		p1.mostrarNombre();
		
	}

}
