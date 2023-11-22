package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		double saldo = 0;
		String nombreTit = "";
		int boton;
		int cero = 0;
		double cantidad;

		double retirar;

		Cuenta c = new Cuenta(saldo, nombreTit);
		System.out.println("Bienvenido al programa de una cuenta corriente");

		System.out.println("Ingrese su saldo actual");
		c.setSaldo(Leer.datoDouble());
		do {

			System.out.println("""

					1.Para Ingresar dinero
					2.Para retirar saldo
					3.Conversion dolar
					4.Mostrar saldo
					0.Para salir
					""");
			boton = Leer.datoInt();
			switch (boton) {

			case 1:

				System.out.println("Introduzca la cantidad que quiere ingresar");
				cantidad = Leer.datoDouble();
				c.IngresarC(cantidad);
				c.MostrarSaldo();
				break;
			case 2:
				System.out.println("Ingrese la cantidad que quiere retirar");
				retirar = Leer.datoDouble();
				if(retirar>c.getSaldo()) {
					System.out.println("Dinero insuficiente");
				}
				else {
					c.RetirarS(retirar);
					
				
				}
				
				break;
			case 3:

				c.MostrarDolar(c.CalculoDolar());
				break;
			case 4:
				System.out.println("En la cuenta le queda : ");
				c.MostrarSaldo();
				
				break;
			default:
				System.out.println("");

			}

		} while (boton != cero);

	}

}
