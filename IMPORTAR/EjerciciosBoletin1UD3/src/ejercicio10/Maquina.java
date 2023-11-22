package ejercicio10;

import java.util.Arrays;

public class Maquina {

	private Ticket []lista;

	public Maquina(Ticket[] lista) {
		
		this.lista = lista;
	}

	public Ticket[] getLista() {
		return lista;
	}

	public void setLista(Ticket[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Maquina [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	
	public void comprar(Ticket t , int posicion) {
		lista[posicion]=t;
	}
	
	
}
