package ejemplo05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int dia=0;
		int mes=0;
		int anio=0;
		Fecha nacimiento = new Fecha (15,05,2004);
		Fecha contratacion = new Fecha(15,06,2023);
	
		
		
		Empleado empleado = new Empleado("Carlos","Roman",nacimiento,contratacion);
		
		System.out.println("que dia es hoy");
		dia=Leer.datoInt();
		System.out.println("de que mes");
		mes=Leer.datoInt();
		
		Fecha actual = new Fecha (dia,mes);
		
		empleado.felicitarCumple(actual);
		System.out.println(empleado);
		empleado.rejuvenecer(nacimiento);
		System.out.println(empleado);
	}

}
