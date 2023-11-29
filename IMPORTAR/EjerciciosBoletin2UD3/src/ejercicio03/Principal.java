package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		int boton;
		int cero=0;
		int tam;
		int posicion=0;
		String marca;
		String modelo;
		Boolean venta;
		int estadoVenta;
		Boolean estado;
		int estado0;
		double precioUnitario;
		
		Movil [] movil;
		Movil m;
		
		System.out.println("Bienvenidos a la muestra de un telefono");
		System.out.println("");
		System.out.println("Cuantos telefonos tiene");
		tam=Leer.datoInt();
		
		movil = new Movil [tam];
		Vendedor v = new Vendedor ();
		do {
		System.out.println("""
				********************
				PULSE:
				->0.Para salir
				->1.Para añadir un producto
				->2.Para comprobar cuantos moviles quedan por vender
				->3.Para hacer un descuento
				->4.Si desea hacer algun cambio
				->5.Calcular cuanto dinero tiene segun lo vendido
				""");
			boton=Leer.datoInt();
			switch(boton) {
			
			case 1:
				System.out.println("Diga la marca del movil por favor");
				marca=Leer.dato();
				System.out.println("Que modelo es");
				modelo=Leer.dato();
				System.out.println("Pulse 1 si lo ha vendido, otro numero en caso de lo contrario");
				estadoVenta=Leer.datoInt();
				if(estadoVenta==1) {
					venta=true;
				}
				else {
					venta=false;
				}
				System.out.println("Pulse 1 si su telefono es de primera mano, otro numero en caso de lo contrario");
				estado0=Leer.datoInt();
				if(estado0==1) {
					
					estado=true;
					
				}
				else {
					estado=false;
				}
				System.out.println("Diga el precio del producto por favor");
				precioUnitario=Leer.datoDouble();
				
				m=new Movil(marca,modelo,venta,estado,precioUnitario);
				v.añadirTelefono(posicion, m);
				posicion++;
				
				System.out.println(v);
				break;
				
		
				
			}
		
		
		
			
		}while (boton!=cero);
	}

}
