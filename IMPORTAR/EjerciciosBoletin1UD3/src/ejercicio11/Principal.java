package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int boton;
		int cero = 0;
		int tam;
		int desde;
		int hasta;
		int[] notas;
		int mod;
		int nuevaNota;
		Alumno alumno = new Alumno();
		GestionNotas n = new GestionNotas();

		System.out.println("Bienvenidos a la muestra de notas de los alumnos de una clase");
		System.out.println("Diga cuantas asignaturas tiene");
		tam=Leer.datoInt();
		notas = new int[tam];
		do {
			
			System.out.println("""
					-> 1.Para mostrar notas
					-> 2.Para modificar una nota
					-> 3.Calcular la nota media
					-> 4.Para mostrar el numero de suspensos
					""");
			boton = Leer.datoInt();
			switch (boton) {
			
			case 1:
				System.out.println("Diga cual fue su nota minima");
				desde=Leer.datoInt();
				System.out.println("Diga cual fue su nota maxima");
				hasta=Leer.datoInt();
				n.generarNotasRandom(hasta, desde, notas);
				n.mostrarNotas(notas);
				
				break;
				
			case 2:
				System.out.println("Diga la posicion que quiere cambiar");
				mod=Leer.datoInt();
				System.out.println("Diga la nota nueva que quiere añadir");
				nuevaNota=Leer.datoInt();
				n.cambiarNota(notas, nuevaNota, tam);
				n.mostrarNotas(notas);
					
				
			}
			
			

		} while (boton != cero);
	}

}
