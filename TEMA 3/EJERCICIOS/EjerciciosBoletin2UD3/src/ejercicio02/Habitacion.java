package ejercicio02;

public class Habitacion {

	
	//
	
	private double precio;
	private int numeroDiasContratados;
	private String nombreCliente;
	private String tipo;
	private Boolean servicioExtra;
	private Boolean limpieza;
	private Boolean activa;
	private Boolean ocupado;
	
	public Habitacion(double precio, int numeroDiasContratados, String nombreCliente, 
			String tipo,
			Boolean servicioExtra, Boolean limpieza, Boolean activa, Boolean ocupado) {
		this.precio = precio;
		this.numeroDiasContratados = numeroDiasContratados;
		this.nombreCliente = nombreCliente;
		this.tipo = tipo;
		this.servicioExtra = servicioExtra;
		this.limpieza = limpieza;
		this.activa = activa;
		this.ocupado = ocupado;
	}

	public Habitacion() {
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNumeroDiasContratados() {
		return numeroDiasContratados;
	}

	public void setNumeroDiasContratados(int numeroDiasContratados) {
		this.numeroDiasContratados = numeroDiasContratados;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getServicioExtra() {
		return servicioExtra;
	}

	public void setServicioExtra(Boolean servicioExtra) {
		this.servicioExtra = servicioExtra;
	}

	public Boolean getLimpieza() {
		return limpieza;
	}

	public void setLimpieza(Boolean limpieza) {
		this.limpieza = limpieza;
	}

	public Boolean getActiva() {
		return activa;
	}

	public void setActiva(Boolean activa) {
		this.activa = activa;
	}

	public Boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Habitacion \t"
                + "\n-----------------"
                + 
                "\n Tipo habitación:" + tipo + 
                "\n Precio:" + precio + 
                "\n Nombre cliente: "+ nombreCliente 
                + "\n Servicios extras:" + servicioExtra + 
                "\n Días:" + numeroDiasContratados
                + "\n Habitación ocupada:" + ocupado;
	}
	
	
	
}
