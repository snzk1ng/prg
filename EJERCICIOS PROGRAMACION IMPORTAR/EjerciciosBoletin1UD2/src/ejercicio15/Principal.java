package ejercicio15;

import Utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int cantidad=0;
		double nota=0;
		double notaMedia=0;
		int numSusp=0;
		double total=0;
		int tope=6;
		
		System.out.println("Bienvenidos al cálculo de la nota media de un alumno, y el número suspensos que tiene");
		
		do {
			
			System.out.println("Digame su nota por favor");
			nota=Leer.datoDouble();
			total+=nota;
			System.out.println(total);
			cantidad++;
			notaMedia=total/6;

			 if(nota<5) {
				 numSusp++;
			 }
			 
			 
		}while(cantidad<tope);
		
		
		System.out.printf("%.2f es su nota media \n",notaMedia);

		System.out.printf("Usted tiene %d asignturas suspensas\n",numSusp);
		if(numSusp<=0) {
			System.out.println("y  ha pasado limpio");
		}
	}
}
