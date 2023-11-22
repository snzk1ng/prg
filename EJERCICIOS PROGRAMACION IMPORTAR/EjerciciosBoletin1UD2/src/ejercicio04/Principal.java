package ejercicio04;

import Utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		double saldoActual;
		double cantidadRetirar;
		
		System.out.println("Por favor dime el saldo en la cuenta");
		saldoActual=Leer.datoDouble();
		System.out.println("Perfecto, cuanto quiere retirar?");
		cantidadRetirar=Leer.datoInt();
		
		if(cantidadRetirar>saldoActual) {
			
			System.out.println("Error, usted quiere retirar un dinero que no tiene");
			
		}
		
		else {
			System.out.println("Ahí tiene su dinero");
		}
			
		saldoActual=saldoActual-cantidadRetirar;
		System.out.printf("Con el dinero retirado se queda en %.2f",saldoActual);
		
		
		
		
		
		
		

	}

}
