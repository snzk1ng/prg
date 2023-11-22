package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		 String nombreA;
		 String aula;
		 String fecha;
		 
		 Cabecera c1;
		 
		 System.out.println("Diga el nombre de la asignatura");
		 nombreA=Leer.dato();
		 System.out.println("Diga el aula");
		 aula=Leer.dato();
		 System.out.println("Diga la fecha");
		 fecha=Leer.dato();
		 
		 c1=new Cabecera(nombreA ,aula ,fecha );
		 c1.mostrarCab();

	}

}
