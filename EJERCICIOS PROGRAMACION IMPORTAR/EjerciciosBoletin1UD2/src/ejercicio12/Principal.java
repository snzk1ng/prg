package ejercicio12;

import Utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		double pesoPers = 0;
		double alturaPers = 0;
		double imcPers = 0;
		int pulsador = 0;

		System.out.println("Bienvenido al programa de calculo de IMC de una persona");
		System.out.println("");
		System.out.println("Por favor introduzca su altura");
		alturaPers = Leer.datoDouble();
		System.out.println("Ahora su peso");
		pesoPers = Leer.datoDouble();
		imcPers = pesoPers / (alturaPers * Math.pow(alturaPers, 2));
		System.out.printf("Su IMC es de %.2f \n", imcPers);
		System.out.println("*******************************");
		System.out.println("Pulse 1 si su imc es <16");
		System.out.println("Pulse 2 si su imc es de 16 a 17");
		System.out.println("Pulse 3 si su imc es de 17 a 18");
		System.out.println("Pulse 4 si su imc es de 18 a 25");
		System.out.println("Pulse 5 si su imc es de 25 a 30");
		System.out.println("Pulse 6 si su imc es de 30 a 35");
		System.out.println("Pulse 7 si su imc es de 35 a 40");
		System.out.println("Pulse 8 si su imc es de >40");

		pulsador = Leer.datoInt();

		switch (pulsador) {

		case 1:

			System.out.println("Criterio de ingreso en hospital");
			break;

		case 2:

			System.out.println("infrapeso");
			break;

		case 3:

			System.out.println("bajo peso");
			break;

		case 4:

			System.out.println("peso normal");
			break;

		case 5:

			System.out.println("sobrepeso");
			break;

		case 6:

			System.out.println("sobrepeso cronico");
			break;

		case 7:

			System.out.println("obesidad premorbida");
			break;

		case 8:

			System.out.println("obesidad morbida");
			break;

		default:
			System.out.println("Error");

		}
		System.out.println("*************************************");
		System.out.println("Gracias por usar el programa");
	}

}
