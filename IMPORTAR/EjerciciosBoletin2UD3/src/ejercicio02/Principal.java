	package ejercicio02;
	
	import utilidades.Leer;
	
	public class Principal {
	
		public static void main(String[] args) {
			
			double precio;
			int numeroDiasContratados;
			int posicion=0;
			int boton;
			int cero=0;
			int tam;
			int servicios;
			int serviciosLimpieza;
			int actividad;
			int ocupacion;
			String nombreCliente;
			String tipo;
			Boolean servicioExtra;
			Boolean limpieza;
			Boolean activa;
			Boolean ocupado;
			int contador=0;
			
			Habitacion h = new Habitacion();
			Habitacion[] habitacion;
			Hotel ho = new Hotel();
			
			System.out.println("Bienvenidos al programa donde mostramos una habitacion en alquiler");
			System.out.println("Cuantas habitaciones quiere contratar");
			tam=Leer.datoInt();
			habitacion= new Hotel (Hotel);
			do {
				
				System.out.println("""
						************************
						Pulse:
						-> 1.Para agregar una habitacion y ver si esta ocupada
						-> 2.Para calcular el precio final segun el num de dias y servicios extras contratados
						-> 3.Para mostrar factura
						-> 0.Para salir
						""");
					boton=Leer.datoInt();
					switch(boton) {
					
					case 1:
						
						System.out.println("Diga el precio y el numero de dias contratados por favor");
						precio=Leer.datoDouble();
						h.setPrecio(precio);
						numeroDiasContratados=Leer.datoInt();
						h.setNumeroDiasContratados(numeroDiasContratados);
						
						System.out.println("Diga su nombre por favor");
						nombreCliente=Leer.dato();
						h.setNombreCliente(nombreCliente);
						
						System.out.println("Diga el tipo de habitacion que quiere");
						tipo=Leer.dato();
						h.setTipo(tipo);
						
						System.out.println("Pulse 1 si ha contratado servicios extras, 0 en caso de lo contrario");
						servicios=Leer.datoInt();
						if(servicios==1) {
							servicioExtra=true;
						}
						else {
							servicioExtra=false;
						}
						h.setServicioExtra(servicioExtra);
						
						System.out.println("Pulse 1 si ha contratado servicios de limpieza, 0 en caso de lo contrario");
						serviciosLimpieza=Leer.datoInt();
						if(serviciosLimpieza==1) {
							
							limpieza=true;
							
						}
						else {
							limpieza=false;
					
						}
						
						h.setServicioExtra(servicioExtra);
						System.out.println("Pulse 1 si la habitacion esta activa, 0 en caso de lo contrario");
						actividad=Leer.datoInt();
						if(actividad==1) {
							activa=true;
						}
						else {
							activa=false;
						}
						
						h.setActiva(activa);
						
						System.out.println("Pulse 1 si la habitacion esta ocupada, 0 en caso de lo contrario");
						ocupacion=Leer.datoInt();
						if(ocupacion==1) {
							ocupado=true;
						}
						else {
							ocupado=false;
						}
					
						h.setOcupado(ocupado);
						ho.agregarProducto(h, contador);
						contador++;
					}
				
				
			}while(boton!=cero);
	
		}
	
	}
