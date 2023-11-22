package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		double altura;
		double radio;
		
		
		System.out.println("Ingresa la altura del cilindro");
		altura=Leer.datoDouble();
		System.out.println("Ingrese el radio del cilindro");
		radio=Leer.datoDouble();
		
		Cilindro c= new Cilindro (radio , altura);
		double volumen = c.calcularVolumen();
		
		System.out.printf("El volumen del cilindro es de %.2f  ", volumen);
	}

}
