package ejercicio11;

import java.util.Random;

public class GestionNotas {

	

	
	public void generarNotasRandom(int hasta, int desde , int [] notas) {
		
		Random rdm = new Random (System.nanoTime());
		
		for (int i = 0; i < notas.length; i++) {
			notas[i]=rdm.nextInt(hasta-desde+1)+desde;
		}
		
		
	}
	
	public void mostrarNotas(int []notas) {
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(" "+notas[i]);
		}
		
	}
	
	public void cambiarNota (int []notas , int posicion , int notaCambiar) {
		
		notas [posicion] = notaCambiar;
		
	}
	
	public void mostrarNotaNueva(int []notas) {
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(" "+notas[i]);
		}
	}
	
}


