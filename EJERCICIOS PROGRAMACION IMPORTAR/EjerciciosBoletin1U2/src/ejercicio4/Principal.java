package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		/*Leer un número que será la cantidad de dinero que una 
		 * persona quiere retirar de su cuenta
		bancaria. Mostrar un mensaje diciendo que “no es posible” si la 
		cantidad que se quiere retirar
		es mayor que el saldo de la cuenta y el nuevo saldo si 
		se ha podido retirar.*/
		
		int saldoActual=40;
		int saldoRetirar=0;
		
		
		
	
		System.out.println("Introduzca "
				+ "la cantidad de dinero que quiera reitrar por favor");
		saldoRetirar=Leer.datoInt();
		if(saldoRetirar>saldoActual) {
			
			System.out.println("Error, su saldo es menor a la "
					+ "cantidad que quiere retirar");
		}
		
		
		else {
		System.out.println("Ahi tiene su dinero!");
	}

	}
}