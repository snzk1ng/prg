package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=0;
		
		System.out.println("Dime un numero del 1 al 10 por favor");
		num1=Leer.datoInt();
		System.out.println("Digame ahora otro por favor");
		num2=Leer.datoInt();
		
		if(num1>=num2) {
			
			System.out.println("Correcto, el num1 es igual o mayor que el num2");
		}
		else {
			System.out.println("El num2 es mayor que el num 1");
		}
		
	
			System.out.println("Adios");
		
		
		
	}

}
