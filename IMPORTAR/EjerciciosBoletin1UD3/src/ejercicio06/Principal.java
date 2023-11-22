package ejercicio06;

import java.util.Scanner;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		int num=0 , hasta, desde;
		int numero;
		int numero3;
		int primitiva = 6;

		boolean result = true;

		Generadora g = new Generadora();

		System.out.println("Bienvenido, en el siguiente programa vamos a crear un generador de números.");
		System.out.println("******************************************************************************");

		do {
			System.out.println("-----------------");
			System.out.println("0-Salir");
			System.out.println("1-Primitiva");
			System.out.println("2-Par o Impar");
			System.out.println("3-Quiniela");
			System.out.println("-----------------");

			op = Leer.datoInt();

			switch (op) {
			case 0:
				System.out.println("Gracias por utilizar este programa. :)");
				break;
			case 1:
				System.out.println("Introduzca desde: ");
				desde = Leer.datoInt();

				System.out.println("Introduzca hasta: ");
				hasta = Leer.datoInt();

				for (int i = 0; i < primitiva; i++) {
					System.out.print(" " + g.generarPrimitiva(desde, hasta));
				}
				System.out.println();
				break;

			case 2:
				System.out.println("Introduzca el num1: ");
				desde = Leer.datoInt();
				System.out.println("Introduzca el num2: ");
				hasta = Leer.datoInt();
				g.mostrarTF(desde, hasta);
				break;
			case 3:
				System.out.println("Introduzca un numero del uno al 3");
				numero=Leer.datoInt();
				g.mostrarQ(numero);
				
				g.mostrarResulQ(numero);
				break;
			}

		} while (op != 0);
	}

}