package ejercicio01;

import java.util.Arrays;

import model.Producto;

public class Tienda {

	private Producto []lista;
	private double ganancias;
	private double gastosProductos;
	private int numeroProductos;
	private Producto producto;
	
	
	
	public Tienda() {
	}


	public Tienda(Producto[] lista, double ganancias, double gastosProductos, int numeroProductos) {
		this.lista = lista;
		this.ganancias = ganancias;
		this.gastosProductos = gastosProductos;
		this.numeroProductos = numeroProductos;
	}


	public Producto[] getLista() {
		return lista;
	}


	public void setLista(Producto[] lista) {
		this.lista = lista;
	}


	public double getGanancias() {
		return ganancias;
	}


	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}


	public double getGastosProductos() {
		return gastosProductos;
	}


	public void setGastosProductos(double gastosProductos) {
		this.gastosProductos = gastosProductos;
	}


	public int getNumeroProductos() {
		return numeroProductos;
	}


	public void setNumeroProductos(int numeroProductos) {
		this.numeroProductos = numeroProductos;
	}


	
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + ", ganancias=" + ganancias + ", gastosProductos="
				+ gastosProductos + ", numeroProductos=" + numeroProductos + "]";
	}
	
	public void añadirProducto(Producto p) {
		
		lista[numeroProductos]=p;
			numeroProductos++;
	}
	

	public double calcularPrecioTransporte() {
		
		int porciento=12;
		int cien=100;
		double precioProductoTransporte;
		
		precioProductoTransporte=producto.getPrecioCoste()*porciento/cien;
		
		return precioProductoTransporte;
		
	}
	
	
	public double calcularPrecioTotal(double precioProductoTransporte ) {
		
		double precioFinal;
		
		precioFinal=precioProductoTransporte*producto.getPrecioCoste();
		return precioFinal;
		
	}
	
	public Producto buscarPorId(String codigo) {
		
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigoProd().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return lista[i];
		else
			return null;
	}
	
	public double cantidadInvertidaProducto(String codigo) {
		
	}
		
}
	
	

