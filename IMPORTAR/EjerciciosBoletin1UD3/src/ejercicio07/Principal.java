package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int cara=1;
		int cruz=2;
		int eleccion;
		boolean result;
		int boton;
		
		
		CaraCruz c = new CaraCruz();
		do {
			System.out.println("*******************");
			System.out.println("Pulse 1 para jugar");
			System.out.println("Pulse 0 para salir");
			System.out.println("********************");
			boton=Leer.datoInt();
			switch(boton) {
			
			case 1:
				System.out.println("Elija 1 para cara, y 2 si desea cruz");
				eleccion=Leer.datoInt();
				c.MostrarGanador(c.Lanzamiento(cruz, cara, eleccion));
				break;
			case 0:
				
				System.out.println("Saliendo del programa");
				default:
					System.out.println("Opcion invalida");
				break;
			}
			
			
			
		}while(boton!=0);
		
	

	}

}
