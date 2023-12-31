package ejercicio10;

import java.util.Arrays;

public class Maquina {

	private Ticket ticket;
	private String fecha;
	private String contrasenha="a";
	private double dineroIngresado;
	
	public Maquina(Ticket ticket, String fecha, String contrasenha) {
		this.ticket = ticket;
		this.fecha = fecha;
		this.contrasenha = contrasenha;
	}
	
	

	public Maquina() {
	}



	public Maquina(Ticket ticket) {
		this.ticket = ticket;
	}



	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getContrasenha() {
		return contrasenha;
	}

	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}

	@Override
	public String toString() {
		return "Maquina [ticket=" + ticket + ", fecha=" + fecha + ", contrasenha=" + contrasenha + "]";
	}
	
	public boolean comprobarContra(String contrasenha) {
		
		
		
		if(contrasenha.equals(getContrasenha())){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	public void mostrarContra (String contrasenha) {
		
		if(comprobarContra(contrasenha)) {
			System.out.println("Contraseña correcta");
		}
		
		else {
			System.out.println("Incorrecta");
		}
	}
	
		
	
	
	public double calcularTicket() {
		double precio;
		
		precio = ticket.getNumeroTicket()*ticket.getprecioUnitario();
		
		return precio;
	}
	
	public void mostrarCalculo(double precio) {
		
		System.out.println("El precio de su ticket es de: "+precio);
	}
	
	public double calcularCambio(double cambio) {
		
		return cambio-calcularTicket();
		
		
	}
	
	public double calcularDineroDia(double suma) {
		
		
		
		dineroIngresado+=suma;
		return dineroIngresado;
	}


	public void mostrarDineroDia() {
		
		System.out.println("El dinero generado por la maquina en un dia es de: "+dineroIngresado);
		
	}
	
	
	public void resetearDinero() {
		
		dineroIngresado=0;
		
	}
	
	
}


