package ejercicio10;



import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		double precio;
		int numBilletes;
		String fecha;
		String contrasenha="a";
		Ticket tic1;
		double cambio;
		Maquina maq;
		int boton;
		int cero=0;
		maq= new Maquina();
		//set para guardar
		//get mostarlo
		System.out.println("Bienvenid@");
		System.out.println("*******************************************");
		System.out.println("Diga el precio del ticket");
		precio=Leer.datoDouble();
		
		do {
			System.out.println("""
					1.Para acceder a su ticket
					2.Para las funciones del operario
					""");
			boton=Leer.datoInt();
			switch(boton) {
			
				case 1:
			System.out.println("Diga la fecha de hoy por favor");
			fecha=Leer.dato();
			System.out.println("Ahora el numero de personas");
			numBilletes=Leer.datoInt();
			
			tic1= new Ticket(numBilletes,fecha,precio);
			maq=new Maquina(tic1);
			System.out.println(maq.calcularTicket());
			System.out.println("Con cuanto va a pagar");
			cambio=Leer.datoDouble();
			System.out.println("Pulse 1 ahora si quiere que le muestre el cambio a devolver");
			System.out.println("*********************************************************");
			System.out.println("Pulse 2 para mostrar para cuantas personas es valido");
			boton=Leer.datoInt();
			switch(boton) {
			
				case 1:
					maq.calcularCambio(cambio);
					System.out.println("el cambio que se le aplica es de: "+ maq.calcularCambio(cambio));
					break;
				case 2:
					System.out.printf("el ticket es valido para %d personas\n",numBilletes);
					break;
					
					default:
						System.out.println("Opcion no disponible");
			}
			
				case 2:
					
					System.out.println("Introduzca la contraseña para acceder a la maquinaria");
					contrasenha=Leer.dato();
					
					maq.mostrarContra(maq.comprobarContra(contrasenha));
					
			}	
			
			
			}
			
		
		while(boton!=cero);
			
		
		
		
	
		}
		

}
