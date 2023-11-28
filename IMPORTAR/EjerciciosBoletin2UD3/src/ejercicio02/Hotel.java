package ejercicio02;

public class Hotel {

	
	private Habitacion [] habitacion;

	
	
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
		
	}
	
	
}
