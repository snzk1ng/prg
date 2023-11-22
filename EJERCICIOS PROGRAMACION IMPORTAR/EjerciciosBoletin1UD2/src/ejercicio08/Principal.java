package ejercicio08;

import Utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		String usuCon = "Cro4";
		String usuConIntrd = "";

		System.out.println("Bienvenidos a la comprobacion de una contraseña");
		System.out.println("Por favor introduzca su usuario y contraseña");
		usuConIntrd = Leer.dato();
		if (usuConIntrd.equals(usuCon)) {

			System.out.println("Su usuario y contraseña son correctas, adelante");
		}

		else {

			System.out.println("Error");

		}

	}

}
