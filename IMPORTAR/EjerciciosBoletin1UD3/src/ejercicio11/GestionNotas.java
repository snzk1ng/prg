package ejercicio11;

import java.util.Random;

public class GestionNotas {

	

	
	public void generarNotasRandom(int hasta, int desde , double [] notas) {
		
		Random rdm = new Random (System.nanoTime());
		
		for (int i = 0; i < notas.length; i++) {
			notas[i]=rdm.nextDouble(hasta-desde+1)+desde;
		}
		
		
	}
	
	public void mostrarNotas(double []notas) {
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(" "+notas[i]);
		}
		
	}
	
	
	
}


