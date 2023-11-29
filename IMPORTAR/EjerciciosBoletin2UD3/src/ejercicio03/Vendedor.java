package ejercicio03;

import java.util.Arrays;

public class Vendedor {

	private Movil [] movil;
	private int movilesVenidos;
	
	
	


	public Movil[] getMovil() {
		return movil;
	}


	public void setMovil(Movil[] movil) {
		this.movil = movil;
	}


	public int getMovilesVenidos() {
		return movilesVenidos;
	}


	public void setMovilesVenidos(int movilesVenidos) {
		this.movilesVenidos = movilesVenidos;
	}


	@Override
	public String toString() {
		return "Vendedor [movil=" + Arrays.toString(movil) + ", movilesVenidos=" + movilesVenidos + "]";
	}


	public Vendedor() {
	}
	
	public void añadirTelefono(int posicion , Movil m) {
		
		movil[posicion]=m;
		
	}
	
	
}
