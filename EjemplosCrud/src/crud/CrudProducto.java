package crud;

import java.util.Arrays;

import model.Producto;

public class CrudProducto {
	
	private Producto [] lista;
	/*
	 * Constructor para crear un objeto de esta clase pasando :
	 * Como parametro una lista 
	 * que ya puede tener tamaño dado por el usuario en el main
	 */
	public CrudProducto() {
		
	}
	public CrudProducto(Producto[] lista) {
		
		this.lista = lista;
	}
	public Producto[] getLista() {
		return lista;
	}
	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	
	@Override
	public String toString() {
		return "CrudProducto [lista=" + Arrays.toString(lista) + "]";
	}
	
	/*
	 * Pasamos un producto y una posicion y se añae dicho producto en dicha posicion 
	 * Ojo, porque no se comprueba nada , se pierde lo que hablia
	 */
	public void add(Producto p, int posicion) {
		lista[posicion]=p;
		
		
	}
		//METODO PARA BUSCAR EL PRODUCTO//
	public Producto findById(String codigo) {
		int i=0;
		boolean encontrado = false;
		
		while(i<lista.length && !encontrado) {
			Producto deLista = lista[i];
			if(deLista.getCodigo().equalsIgnoreCase(codigo)) /*equalsIgnoreCase se utiliza 
				para comparar cadenas de caracteres*/
				encontrado = true;
			else
				i++;
		}
		
		if (encontrado)
			return lista[i]; //Devolvemos el producto buscado
		else
			return null;
	}
		
		public int findByIdV2(String codigo) {
			int i=0;
			boolean encontrado = false;
			
			while(i<lista.length && !encontrado) {
				Producto deLista = lista[i];
				if(deLista.getCodigo().equalsIgnoreCase(codigo)) /*equalsIgnoreCase se utiliza 
					para comparar cadenas de caracteres*/
					encontrado = true;
				else
					i++;
			}
			
			if (encontrado)
				return i; //Devolvemos el producto buscado
			else
				return -1;
	}
	
		public void editPrecio(String codigo , double precioN) {
			
			int index = findByIdV2(codigo);
			if (index >= 0) {
				lista[index].setPrecioUnitario(precioN);
			}
			
		}
		
		/*public void delete(Producto p) {
			
			int index = findProducto(p);
			if (index>=0)
			lista[index].setActivo(false);
			
		}*/
		
		public void imprimirTodosLosProductos() {
			for (int i = 0; i < lista.length; i++) {
				System.out.println((i+1)+"."+lista[i]);
			}
		}
		
		public void imprimirSoloActivos() {
			
			
			for (int i = 0; i < lista.length && lista[i]!=null; i++) {
				if(lista[i].isActivo()) { //no se pone lista[i]= true pq iscativo ya es un booleano
					System.out.println((i+1)+"."+lista[i]);
				}
			}
			
		}
	
}
