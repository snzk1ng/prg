package ejercicio10;

public class Ticket {

	
	private int numeroTicket;
	private int fecha;
	private double precioViaje;
	
	
	public Ticket(int numeroTicket, int fecha, double precioViaje) {
		
		this.numeroTicket = numeroTicket;
		this.fecha = fecha;
		this.precioViaje = precioViaje;
	}


	public int getNumeroTicket() {
		return numeroTicket;
	}


	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}


	public int getFecha() {
		return fecha;
	}


	public void setFecha(int fecha) {
		this.fecha = fecha;
	}


	public double getPrecioViaje() {
		return precioViaje;
	}


	public void setPrecioViaje(double precioViaje) {
		this.precioViaje = precioViaje;
	}


	@Override
	public String toString() {
		return "Ticket [numeroTicket=" + numeroTicket + ", fecha=" + fecha + ", precioViaje=" + precioViaje + "]";
	}
	
	
		
		
		
		
		
	
}
