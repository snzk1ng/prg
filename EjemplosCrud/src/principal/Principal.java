package principal;

import java.util.ArrayList;

import crud.CrudProducto;
import model.Producto;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int tam;
		
		Producto [] listado;
		Producto p1;
		Producto p2;
		CrudProducto cp;
		
		p1 = new Producto("1a", "Atun", 1.50, true);
		p2 = new Producto("2b", "Pipas", 0.40, true);
		
	
		
		System.out.println("Indique el tamaño");
		tam = Leer.datoInt();
		 listado= new Producto[tam];
		cp = new CrudProducto(listado);
		
		

		

		

		cp.add(p1, 0);
		cp.add(p2, 1);

		System.out.println(p1);
		System.out.println(p2);

	}

}
