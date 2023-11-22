package ejercicio10;

import Utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		String Pelicula="";
		int salas;
		double costoEntradas=0;
		double precioEntradas=0;
		int numeroEntradas=0;
		int pulsarBoton=0;
		
		System.out.println("Escoja la pelicula por favor");
		Pelicula=Leer.dato();
		
		System.out.println("Hola, elija un numero del 1 al 4 para la sala");
		
		salas=Leer.datoInt(); 
			switch(salas) {
			case 1:
				System.out.println("Sala vip");
				System.out.println("Diga el precio de la entrada");
				precioEntradas=Leer.datoDouble();
				System.out.println("Seleccione el numero de entradas");
				numeroEntradas=Leer.datoInt();
				costoEntradas=precioEntradas*numeroEntradas;
				System.out.printf("Costo entradas de: %.2f€ ", costoEntradas);
				
				
				
				break;
				
			case 2:
				System.out.println("Sala 3d");
				System.out.println("Diga el precio de la entrada");
				precioEntradas=Leer.datoDouble();
				System.out.println("Seleccione el numero de entradas");
				numeroEntradas=Leer.datoInt();
				costoEntradas=precioEntradas*numeroEntradas;
				System.out.printf("Costo entradas de: %.2f€ ", costoEntradas);
				break;
			case 3:
				System.out.println("Sala normal");
				System.out.println("Diga el precio de la entrada");
				precioEntradas=Leer.datoDouble();
				System.out.println("Seleccione el numero de entradas");
				numeroEntradas=Leer.datoInt();
				costoEntradas=precioEntradas*numeroEntradas;
				System.out.printf("Costo entradas de: %.2f€ ", costoEntradas);
				
				break;
				
			case 4:
				System.out.println("Sala infantil");
				System.out.println("Diga el precio de la entrada");
				precioEntradas=Leer.datoDouble();
				System.out.println("Seleccione el numero de entradas");
				numeroEntradas=Leer.datoInt();
				costoEntradas=precioEntradas*numeroEntradas;
				System.out.printf("Costo entradas de: %.2f€ ", costoEntradas);
				
				
			}
				
			
				
				
			}
		
			
		
		
	
				
		
		
		
		
		
		
		
		
	}


