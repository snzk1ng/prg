package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int decimo= 0;
		int boton;
		int cero = 0;
		int numDec;
		
		
		Sorteo s = new Sorteo();
		

		System.out.println("Bienvenido al programa donde mostramos un decimo y mostramos el ganador");
		
		
		do {
			
			System.out.println("""
					***************************************************************
					1.Para elegir el decimo que quiere y el que le asigna la maquina					
					2.Para generar el numero ganador
					3.Para mostrar si eres ganador
					0.Para salir
					
					***************************************************************
					""");
			boton = Leer.datoInt();
			switch (boton) {
			
			case 1 :
				
				System.out.println("Elija el decimo que quiera comprar");
				numDec=Leer.datoInt();
				System.out.println("El numero de su decimo es:");
				decimo = s.GenerarSorteo();
				
				s.MostrarNumDecimo(decimo);
				break;
			case 2:
				System.out.println("");
				s.GenerarGanador();
				s.MostrarNumeroGanador(s.GenerarSorteo());
				break;
			case 3:
				
				
				s.Ganador(s.GanadorSorteo());
				break;
			
			case 0:
				System.out.println("");
				System.out.println("Saliendo del programa");
				break;
				default:
				System.out.println("Incorrecto");
			}
			
			
		}
		while(boton!=cero);
		
		

	}

}
