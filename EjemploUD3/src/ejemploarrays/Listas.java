package ejemploarrays;

import java.util.Random;

public class Listas {

	public void rellenarArray(int hasta, int desde, int[] lista1) {

		Random rdm = new Random(System.nanoTime());
		for (int i = 0; i < lista1.length; i++) {
			lista1[i] = rdm.nextInt(hasta - desde + 1) + desde;
		}

	}
	
	public void mostrarArray(int []lista) {
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print(" "+lista[i]);
		}
		
	}
	//Dos versiones : 1(Pasando una lista como parametro)
	//instanciando dentro del metodo
	
	public int [] trucarLista(int [] lista){
		int diez = 10;
		for (int i = 0; i < lista.length; i++) {
			lista[i]=diez;
		}
		return lista;
	}
	
	
	
	
}