package com.empresa;

public class CondicionalesIf {

	public static void main(String[] args) {
		String var1 = "Hola";
		String var2 = "Equipo";
		
		int a = 100;
		int b = 200;
		
		//Primer tipo de if
		/*if(a>1000)
		{
			System.out.print("a es mayor que 1000");
		}*/
        
		//Segundo tipo de if
		/*if(a<1000)
		{
			System.out.print("a es menor que 1000");
		}
		else
		{
			System.out.print("a es mayor que 1000");
		}*/
		
		//Tercer tipo de if
		if(a==100)
		{
			System.out.print("a es 100");
		} 	
	
		else if (a==200)
		{
			System.out.print("a es 200");
		}
		else if (a==300)
		{
			System.out.print("a es 300");
		}
		else
		{
			System.out.print("a no es igual a ninguno de los numeros");
		}
		
	}
		
	}


