package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
	
		double num1=0;
		double num2=0;
		double result=0;
		double division=0;
		
		
		
		System.out.println("¿Cuanto es el valor de num1?");
		num1=Leer.datoDouble();
		System.out.println("¿Cuanto es el valor de num2?");
		num2=Leer.datoDouble();
		
		if(num2==result) {
			System.out.println("Error");
		}
		else {
			division=num1/num2;
			System.out.printf("%.2f",division);
		}
	
		
		
	
	
	
	
	
	
	
	
	}

}
