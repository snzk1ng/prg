package ejercicio14;

import Utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
	
		int num=0;
		int resultado=0;
		int uno=1;
		
		System.out.println("Digame un numero por favor ");
		num=Leer.datoInt();

	 
		while(num<=10) {
			
			resultado=num+uno;
			System.out.println(num+"+"+uno+"="+resultado);
			num++;
		}
	}
}