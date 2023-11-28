package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tam;
		Producto [] lista;
		String codigoProducto;
		int boton;
		int cero=0;
		int fragil;
		double ganancias;
		double precioFabrica;
		double precioCoste;
		double precioProductoTransporte;
		Producto p = new Producto();
		Tienda t = new Tienda();
		
		
		
		System.out.println("Bienvenidos a la muestra de unos productos");
		System.out.println("Introduzca cuantos productos tiene por favor");
		tam=Leer.datoInt();
		lista = new Producto[tam];
		do {
			
			System.out.println("""
					Pulse:
					-> 1. Para listar todos los productos
					-> 2. Para comprobar si es un objeto fragil
					-> 3. Para añadir un producto a la lista 
					-> 4. Para calcular la cantidad invertida por producto
					-> 5. Para calcular el PVP
					-> 6. Para calcular las posibles ganancias
					""");
			
			boton=Leer.datoInt();
			switch (boton) {
			case 1:
				
				System.out.println("Diga de cuanto fue el precio de fabrica del producto");
				precioFabrica=Leer.datoDouble();
				p.setPrecioFabrica(precioFabrica);
				System.out.println("Diga la dureza del producto");
				fragil=Leer.datoInt();
				p.setFragil(fragil);
				System.out.println("Ahora el codigo por favor");
				codigoProducto=Leer.dato();
				p.setCodigoProd(codigoProducto);
				System.out.println("A cuanto esta en venta el producto");
				precioCoste=Leer.datoDouble();
				p.setPrecioCoste(precioCoste);
				
				t.añadirProducto(p);
				
				
				break;
			
			case 2:
				System.out.println("Estos son sus productos");
				System.out.println(p);
			
				
				break;
				
			case 3:
				System.out.println("Diga el codigo del producto por favor");
				codigoProducto=Leer.dato();
				t.buscarPorId(codigoProducto);
				if (p.isFragil()<10) {
					System.out.println("Su producto es resistente");
				}
				else {
					System.out.println("Su producto es fragil");
				}
	
				break;
				
	
			
			case 4:
				
			System.out.println("La cantidad invertida en el producto fue de:");
			
			
	}	
		}while(boton!=0);
		
		}

	}

		

		
		
		
	