package ejemploarrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Listas listado = new Listas();
		int desde;
		int hasta;
		int [] lista;
		int tam;
		 
		
		
		System.out.println("Diga el tamaño de la lista");
		tam=Leer.datoInt();
		lista= new  int [tam];
		System.out.println("Diga desde");
		desde=Leer.datoInt();
		System.out.println("Diga hasta");
		hasta=Leer.datoInt();
		
		
		listado.rellenarArray(hasta, desde, lista);
		listado.mostrarArray(lista);
		
		listado.trucarLista(lista);
		System.out.println();
		listado.mostrarArray(listado.trucarLista(lista));
	}

}
