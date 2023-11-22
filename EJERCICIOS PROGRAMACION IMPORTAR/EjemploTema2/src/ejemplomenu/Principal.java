package ejemplomenu;

import utilidadesd.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion;

		System.out.println("Pulse 1 para buenos dias");
		System.out.println("Pulse 2 para buenas tardes");
		System.out.println("Pulse 3 para buenas noches");
		opcion = Leer.datoInt();
		switch (opcion) {

		case 1:
			System.out.println("Buenos dias");
			break;
		case 2:
			System.out.println("Buenas tardes");
			break;
		case 3:
			System.out.println("Buenas noches");
			break;

		default:
			System.out.println("Opcion no valida aweonao");
			System.out.println("Gracias por usar este programa");
			System.out.println("HIJO DE LA PERRV");
	
		}
			System.out.println("Xao perkin ql");
	}

}
