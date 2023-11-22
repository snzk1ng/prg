package ejemplo02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		double notaPro;
		double notaBD;
		double media;
		Alumno a1;
		
		System.out.println("Diga su nombre");
		nombre=Leer.dato();
		System.out.println("Diga su nota de programacion");
		notaPro=Leer.datoDouble();
		System.out.println("Diga su nota de BD");
		notaBD=Leer.datoDouble();
		
		a1=new Alumno (nombre , notaPro , notaBD );
		
		media=a1.calcularMedia();
		
		a1.mostrarMed(media);
		

	}

}
