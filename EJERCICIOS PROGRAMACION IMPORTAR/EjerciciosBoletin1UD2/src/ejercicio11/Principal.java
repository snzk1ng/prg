package ejercicio11;

import Utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		
		
		
		
		/*Realizar un programa dirigido por menús que solicite el peso de una persona, y escriba por
pantalla su peso en cualquier planeta del Sistema Solar. Las equivalencias son las siguientes
(basta con multiplicar el peso de la persona en la tierra por la constante de equivalencia):
PLANETA Mercurio Venus Tierra Marte Júpiter Saturno Urano Neptuno
EQUIVALENCIA 0.38 0.91 1.00 0.38 2.53 1.06 0.92 1.2*/

		
		double pesoPersonaP;
		double pesoPersona;
		double mercurio=0.38;
		double venus=0.91;
		double tierra=1.00;
		double marte=0.38;
		double jupiter=2.53;
		double saturno=1.06;
		double urano=0.92;
		double neptuno=1.2;
		int seleccionarPla=0;
		System.out.println("Bienvenido al programa donde vamos a calcular el peso de una persona en los planetas del sistema solar");
		System.out.println("Por favor, escriba su peso actual");
		pesoPersona=Leer.datoDouble();
		System.out.println("");
		System.out.println("Perfecto, vamos a calcular su peso en otros planetas, por favor seleccione un numero del 1 al 8");
		
		
		seleccionarPla=Leer.datoInt();
		switch(seleccionarPla) {
		case 1:
			System.out.println("Ha seleccionado mercurio");
			pesoPersonaP=pesoPersona*mercurio;
			System.out.printf("Su peso es de %.2f kg ",pesoPersonaP);
			break;
		case 2:
			System.out.println("Ha seleccionado venus");
			pesoPersonaP=pesoPersona*venus;
			System.out.printf("Su peso es de %.2f kg ",pesoPersonaP);
			break;
		case 3:
			System.out.println("Ha seleccionado la Tierra");
			pesoPersonaP=pesoPersona*tierra;
			System.out.printf("Su peso es de %.2f kg ",pesoPersonaP);
			break;
		case 4:
			System.out.println("Ha seleccionado marte");
			pesoPersonaP=pesoPersona*marte;
			System.out.printf("Su peso es de %.2f kg ",pesoPersonaP);
			break;
		case 5:
			System.out.println("Ha seleccionado jupiter");
			pesoPersonaP=pesoPersona*jupiter;
			System.out.printf("Su peso es de %.2f kg ",pesoPersonaP);
			break;
		case 6:
			System.out.println("Ha seleccionado saturno");
			pesoPersonaP=pesoPersona*saturno;
			System.out.printf("Su peso es de %.2f kg ",pesoPersonaP);
			break;
		case 7:
			System.out.println("Ha seleccionado urano");
			pesoPersonaP=pesoPersona*urano;
			System.out.printf("Su peso es de %.2f kg ",pesoPersonaP);
			break;
		case 8:
			System.out.println("Ha seleccionado neptuno");
			pesoPersonaP=pesoPersona*neptuno;
			System.out.printf("Su peso es de %.2f kg ",pesoPersonaP);
			
			break;
			
			default:
				System.out.println("Opcion no disponible, marque del 1 al 8 unicamente");
				
			break;
		}
		
		System.out.println("Gracias por usar el programa");
		
		
		
		
		
		

	}

}
