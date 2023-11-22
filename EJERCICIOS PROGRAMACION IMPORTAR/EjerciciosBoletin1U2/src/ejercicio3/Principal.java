package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		double num1=0.0;
		double dos=2.0;
		double resto=0.0;
		double cero=0.0;
		
		
		
		System.out.println("Introduzca un numero por favor");
		num1=Leer.datoInt();
		
		resto=num1%dos;
		if (resto==cero) {
			System.out.println("Numero par");
		}
		else {
			System.out.println("numero inpar");
		}
	}
	

}
