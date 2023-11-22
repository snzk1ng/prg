package ejercicio19;

import Utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		double num1 = 0;
		double num2 = 0;
		double result = 0;

		int dos = 2;
		int pulsador = 0;
		int cero = 0;
		System.out.println("Bienvenidos al calculo realizado por una calculadora");

		do {

			System.out.println("""
					1.Sumar
					2.Restar
					3.Multiplicar
					4.Dividir
					0.Salir
					""");
			pulsador = Leer.datoInt();

			switch (pulsador) {

			case 1:

				System.out.println("SUMAR,introduzca el primer numero ");
				num1 = Leer.datoDouble();
				System.out.println("Ahora el segundo");
				num2 = Leer.datoDouble();
				result = num1 + num2;
				System.out.printf("El resultado de su suma es de %.2f \n", result);
				break;
			case 2:

				System.out.println("RESTAR,introduzca el primer numero ");
				num1 = Leer.datoDouble();
				System.out.println("Ahora el segundo");
				num2 = Leer.datoDouble();
				result = num1 - num2;
				System.out.printf("El resultado de su resta es de %.2f\n", result);
				break;

			case 3:

				System.out.println("MULTIPLICAR,introduzca el primer numero ");
				num1 = Leer.datoDouble();
				System.out.println("Ahora el segundo");
				num2 = Leer.datoDouble();
				result = num1 * num2;
				System.out.printf("El resultado de su multiplicacion es de %.2f\n", result);
				break;
			case 4:

				System.out.println("DIVIDIR,introduzca el primer numero ");
				num1 = Leer.datoDouble();
				System.out.println("Ahora el segundo");
				num2 = Leer.datoDouble();
				result = num1 / num2;
				System.out.printf("El resultado de su division es de %.2f\n", result);
				if(num1!=cero) {
					System.out.println("No se puede dividir entre 0");
				}
				break;

			case 0:
				System.out.println("Saliendo del sistema...");
				break;

			default:
				System.out.println("Accion no valida");
				break;
			}

		} while (pulsador != cero);
		if (result % dos == cero) {
			System.out.println("Su numero es par");
		} else {
			System.out.println("Su numero es impar");
		}
		System.out.println("Gracias por usar el programa :D");
	}

}
