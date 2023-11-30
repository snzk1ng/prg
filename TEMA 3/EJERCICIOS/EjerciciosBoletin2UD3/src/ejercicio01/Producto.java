package ejercicio01;

public class Producto {
	
	private double precioFabrica;
	private int fragil;
	private String codigoProd;
	private double precioCoste;
	
	
	
	public Producto() {
	}


	public Producto(double precioFabrica, int fragil, String codigoProd, double precioCoste) {
		this.precioFabrica = precioFabrica;
		this.fragil = fragil;
		this.codigoProd= codigoProd;
		this.precioCoste = precioCoste;
	}


	public double getPrecioFabrica() {
		return precioFabrica;
	}


	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}


	public int isFragil() {
		return fragil;
	}


	public void setFragil(int fragil) {
		this.fragil = fragil;
	}


	public String getCodigoProd() {
		return codigoProd;
	}


	public void setCodigoProd(String codigoProd) {
		this.codigoProd = codigoProd;
	}


	public double getPrecioCoste() {
		return precioCoste;
	}


	public void setPrecioCoste(double precioCoste) {
		this.precioCoste = precioCoste;
	}


	@Override
	public String toString() {
		return "Producto [precioFabrica=" + precioFabrica + ", fragil=" + fragil + ", codigoProd=" + codigoProd
				+ ", precioCoste=" + precioCoste + "]";
	}
	
	
	
}
