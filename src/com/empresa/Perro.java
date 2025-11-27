package com.empresa;

public class Perro {
	String nombre="Balto";
	String raza="Criollo";
	int altura=4;
	
	public void ladrar()
	{
		System.out.print(nombre+"Esta ladrando");
	}
	
	public static void main(String[] args) {

		Perro perro = new Perro();
		System.out.print(perro.nombre);
		System.out.print(perro.raza);
		System.out.print(perro.altura);
		perro.ladrar();


	}
}
