package ejercicio03;

public class Movil {

	private String marca;
	private String modelo;
	private Boolean venta;
	private Boolean estado;
	private double precioUnitario;
	
	public Movil(String marca, String modelo, Boolean venta, Boolean estado, double precioUnitario) {
		this.marca = marca;
		this.modelo = modelo;
		this.venta = venta;
		this.estado = estado;
		this.precioUnitario = precioUnitario;
	}

	public Movil() {
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Boolean getVenta() {
		return venta;
	}

	public void setVenta(Boolean venta) {
		this.venta = venta;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", venta=" + venta + ", estado=" + estado
				+ ", precioUnitario=" + precioUnitario + "]";
	}
	
	
	
}
