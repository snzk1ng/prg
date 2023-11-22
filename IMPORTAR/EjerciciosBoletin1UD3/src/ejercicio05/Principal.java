package ejercicio05;

import java.util.Iterator;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		String dec="";
		int num=0;
		Copiado c;
		c=new Copiado ();
		
		
		System.out.println("Diga la palabra que quiere decir");
		dec=Leer.dato();
		System.out.println("Diga cuantas veces quiere que se repita");
		num=Leer.datoInt();
		
		
		c.mostrarCop(dec , num);
		
		
		
		
			
		
			
	}

}
