package ejercicio01;

public class Producto {
	
	private double precioFabrica;
	private boolean fragil;
	private int codigoProd;
	private int precioCoste;
	
	
	public Producto() {
	}


	public Producto(double precioFabrica, boolean fragil, int codigoProd, int precioCoste) {
		this.precioFabrica = precioFabrica;
		this.fragil = fragil;
		this.codigoProd = codigoProd;
		this.precioCoste = precioCoste;
	}


	public double getPrecioFabrica() {
		return precioFabrica;
	}


	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}


	public boolean isFragil() {
		return fragil;
	}


	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}


	public int getCodigoProd() {
		return codigoProd;
	}


	public void setCodigoProd(int codigoProd) {
		this.codigoProd = codigoProd;
	}


	public int getPrecioCoste() {
		return precioCoste;
	}


	public void setPrecioCoste(int precioCoste) {
		this.precioCoste = precioCoste;
	}


	@Override
	public String toString() {
		return "Producto [precioFabrica=" + precioFabrica + ", fragil=" + fragil + ", codigoProd=" + codigoProd
				+ ", precioCoste=" + precioCoste + "]";
	}
	
	
	
}
