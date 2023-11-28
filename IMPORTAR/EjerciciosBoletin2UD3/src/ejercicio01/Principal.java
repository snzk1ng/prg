package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tam;
		Producto [] lista;
		String codigoProducto;
		int boton;
		int cero=0;
		double precioFabrica;
		double codigoProd;
		double precioCoste;
		int fragil;
		
		Producto p1 = new Producto();
		Producto p2= new Producto();
		
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
				
				System.out.println("Diga el codigo del producto");
				codigoProd=Leer.datoDouble();
				System.out.println("Diga la fragilidad del produco");
				fragil=Leer.datoInt();
				System.out.println("Diga cuanto costo el producto");
				precioFabrica=Leer.datoDouble();
				System.out.println("Cuanto costo crear el objeto");
				precioCoste=Leer.datoDouble();
			
			}
		
		}while(boton!=0);
		
		
		
		
		
		

	}

}
