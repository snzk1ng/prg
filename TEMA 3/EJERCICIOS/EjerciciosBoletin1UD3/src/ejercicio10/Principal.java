package ejercicio10;



import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		double precio;
		int numBilletes;
		String fecha;
		String contrasenha;
		Ticket tic1;
		Ticket tic2;
		double cambio;
		Maquina maq;
		int boton;
		int cero=0;
		Maquina maquinaSuma = new Maquina();
		
		maq= new Maquina();
		double precioNuevo;
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
			maquinaSuma.calcularDineroDia(maq.calcularTicket());
			
			
			System.out.println("Con cuanto va a pagar");
			cambio=Leer.datoDouble();
			
			if(cambio<maq.calcularTicket()) {
				System.out.println("Esta introduciendo una cantidad menor");
			}
			else {
				System.out.println("");
			}
			
			do {
				
			
			System.out.println("Pulse 1 ahora si quiere que le muestre el cambio a devolver");
			System.out.println("");
			System.out.println("Pulse 2 para mostrar para cuantas personas es valido");
			System.out.println("");
			System.out.println("Pulse 0 para salir");
			boton=Leer.datoInt();
			System.out.println(tic1.toString());
			System.out.println("");
			
			switch(boton) {
			
				case 1:
					
					maq.calcularCambio(cambio);
					System.out.println("el cambio que se le aplica es de: "+ maq.calcularCambio(cambio));
					System.out.println("");
					break;
				case 2:
					System.out.printf("el ticket es valido para %d personas\n",numBilletes);
					System.out.println("");
					break;
					
					
					case 0:
						System.out.println("saliendo del programa");
						break;
					default:
						System.out.println("Opcion no disponible");
					
			}
			}while(boton!=0);
				
				case 2:
					
					System.out.println("Introduzca la contraseña para acceder a la maquinaria");
					contrasenha=Leer.dato();
					maq.mostrarContra(contrasenha);
					
					
					do {
						
						System.out.println("Pulse 1 para saber la cantidad recaudada en un dia");
						System.out.println("Pulse 2 para cambiar el precio de los billetes");
						System.out.println("Pulse 3 para poner el contador a 0");
						System.out.println("Pulse 4 para cambiar el precio del ticket");
						boton=Leer.datoInt();
						switch(boton) {
						
						case 1:
							
						maquinaSuma.mostrarDineroDia();
						break;
						case 2:	
						maquinaSuma.mostrarDineroDia();
						break;
						case 3:
							
						maquinaSuma.resetearDinero();
						break;
						case 4:
						System.out.println("Diga el precio nuevo del billete");
						System.out.println("");
						precioNuevo=Leer.datoDouble();
						tic2=new Ticket();
						tic2.setprecioUnitario(precio);
						System.out.println(tic2.toString());
						break;
						default:
							System.out.println("Opcion incorrecta");
							break;
						case 0:
							System.out.println("Saliendo del programa");
							break;
						}
						
						
					}while(boton!=cero);
					
			}	
			
			
			}
			
		
		while(boton!=cero);
	
		}
		

}
