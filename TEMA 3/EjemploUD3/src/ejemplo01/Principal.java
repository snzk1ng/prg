package ejemplo01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		String nombre;
		int edad;
		double notaMedia;
		String calle;
		Alumno a1;
		Alumno a2;
		//INSTANCIAMOS UN OBJETO CON VALORES 
		
		System.out.println("Diga el nombre");
		nombre=Leer.dato();
		System.out.println("Diga la edad");
		edad=Leer.datoInt();
		System.out.println("Diga la nota media");
		notaMedia=Leer.datoDouble();
		System.out.println("En que calle vives");
		calle=Leer.dato();
		
		a1=new Alumno(nombre , edad , notaMedia); 
		System.out.println(a1.edad);
		
		
		a1.mostrarDatos(calle);
		
	}

}
