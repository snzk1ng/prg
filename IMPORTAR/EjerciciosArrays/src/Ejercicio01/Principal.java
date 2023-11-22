package Ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		String nombre[];
		int tam = 5;
		nombre = new String[tam];
		int pulsar = 0;

		System.out.println("Bienvenidos al programa");

		do {
			System.out.println("0 para salir");
			System.out.println("1 para escribir 5 nombres");
			pulsar=Leer.datoInt();
			switch (pulsar) {
			
			case 1:

				for (int i = 0; i < nombre.length; i++) {
					System.out.println("Escriba un nombre");
					nombre[i] = Leer.dato();
					
				}

				for (int i = 0; i < nombre.length; i++) {
					System.out.println(nombre[i]);
					
					
				}
				break;
			case 0:

				System.out.println("Saliendo del sistema");
				
			}

		} while (pulsar!= 0);
		
		
	}

}
