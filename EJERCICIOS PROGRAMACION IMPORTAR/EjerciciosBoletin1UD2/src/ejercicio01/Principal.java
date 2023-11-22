package ejercicio01;

import Utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		
		System.out.println("Bienvenido al programa donde nos dice qué numero es mayor de los dos");
		System.out.println("Dígame un numero por favor");
		num1=Leer.datoInt();
		System.out.println("Dígame otro ahora");
		num2=Leer.datoInt();
		
		if(num1==num2) {
			System.out.println("Son iguales ambos números");
			
		}
		
		if(num1>num2) {
			System.out.println("El número uno es mayor que el segundo");
		}
		else {
			System.out.println("El segundo es mayor que el primero");
		}
		
		
		
		

	}

}
