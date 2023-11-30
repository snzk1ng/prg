package ejercicio02;

import java.util.Arrays;

public class Hotel {

	
	private Habitacion [] habitacion;
	private int numeroHabitaciones;
	private int id;
	
	public Hotel() {
	}


	public Hotel(Habitacion[] habitacion) {
		this.habitacion = habitacion;
	}


	public Habitacion[] getHabitacion() {
		return habitacion;
	}


	public void setHabitacion(Habitacion[] habitacion) {
		this.habitacion = habitacion;
	}
	
	public void agregarProducto(Habitacion h , int posicion) {
		
		habitacion[posicion]=h;
		numeroHabitaciones++;
		
	}
	
	public void listarHabitaciones() {
		
		
		for (int i = 0; i < habitacion.length; i++) {
			if(habitacion[i]!=null) {
				System.out.println(habitacion[i]);
			}
		}
		System.out.println("");
	}

	public Habitacion findById(int id) {
		
		boolean econtrado = false;
		int i = 0;
		
		while(i<habitacion.wait(i, i))
		
	}
	
	public boolean comprobarOcupacion (Habitacion h ) {
		
		
		boolean result;
		if(h.getOcupado()) {
			
			result=true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public void mostrarOcupacion(Habitacion h) {
		
		if (h.getOcupado()) {
			System.out.println("La habitavion esta ocupada");
		}
		else {
			System.out.println("La habitaacion esta libre");
		}
		
	}
	
	public double calcularPrecioHabitacio(Habitacion h ) {
		
		double total=0.0;
		
		total=(h.getPrecio()*h.getNumeroDiasContratados());
		
		return total;
		
	}
	
	public void mostrarPrecioHabitacion(double total) {
		
		System.out.println("El precio total de la habitacion es de: "+total);
		
	}


	@Override
	public String toString() {
		return "Hotel [habitacion=" + Arrays.toString(habitacion) + "]";
	}
}
