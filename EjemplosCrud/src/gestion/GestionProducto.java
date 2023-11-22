package gestion;

import model.Producto;

public class GestionProducto {

	
	
	
	private Producto p;
	
	public GestionProducto(Producto p) {
		
		this.p = p;
	}
	
	public double calcularLinea (int cantidad) {
		
		double subTotal=0;
		subTotal=cantidad*p.getPrecioUnitario();
		return subTotal;
	}
	
	
	public double CalcularDescento (int tope , double descuento , int cantidad) {
		
		double cien = 100;
		
		if(cantidad>=tope) {                                                                                                                                                                                                                                                                                                                                    
			return calcularLinea(cantidad)-calcularLinea(cantidad)*descuento/cien;
			
				
		}
		else {
			return calcularLinea(cantidad);
		}
	}
	
}
	