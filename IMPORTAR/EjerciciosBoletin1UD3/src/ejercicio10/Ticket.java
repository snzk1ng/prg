package ejercicio10;

public class Ticket {

	
	private int numeroTicket;
	private int fecha;
	private double precioUnitario;
	
	
	public Ticket(int numeroTicket, int fecha, double precioUnitario) {
		
		this.numeroTicket = numeroTicket;
		this.fecha = fecha;
		this.precioUnitario = precioUnitario;
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


	public double getprecioUnitario() {
		return precioUnitario;
	}


	public void setprecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	@Override
	public String toString() {
		return "Ticket [numeroTicket=" + numeroTicket + ", fecha=" + fecha + ", precioUnitario=" + precioUnitario + "]";
	}
	
	
	
		
		
		
		
	
}
