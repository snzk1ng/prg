package ejercicio09;

import java.util.Random;

public class Sorteo { 
	
	//Creo un atributo por que no lo tengo aun que no sea necesario
	private int numPremiado;
	
	public Sorteo(int numPremiado) {
		
		this.numPremiado = numPremiado;
	}
	
	
	@Override
	public String toString() {
		return "Sorteo [numPremiado=" + numPremiado + "]";
	}


	public int generarAleatorio(int hasta , int desde ) {
		int numRandom;
		Random rdm = new Random(System.nanoTime());
		numRandom=rdm.nextInt(hasta-desde+1)+desde;
		return numRandom;
		
	}
	
	
	public int GenerarSorteo() {
		
		int decimo;
		int desde=00001;
		int hasta=99999;
		
		
		
		decimo = generarAleatorio(hasta, desde);
		
		return decimo;
		
		
	} 
	
	public void MostrarNumDecimo(int decimo) {
			
		
		
		System.out.println(decimo);
		
	}
	
	public int GenerarGanador() {
		
		
		int desde=00001;
		int hasta=99999;
		int decimoGanador;
		
		decimoGanador = generarAleatorio(hasta, desde);
		
		return decimoGanador;
	}
		
	public void MostrarNumeroGanador(int decimoGanador) {
		
		
		System.out.println("El numero ganador es: "+decimoGanador);
	
		
	}
		
	public boolean GanadorSorteo() {
		
		
		if(GenerarGanador()==GenerarSorteo()) {
			
			 
			 return true;
		
		}
		else {
			
			 return false;
		}

	}
	public void Ganador (boolean ganador) {
		
		if(ganador) {
			System.out.println("Ha ganado");
		}
		else {
			System.out.println("Ha perdido");
		}
	}
	
	
	
	
}
