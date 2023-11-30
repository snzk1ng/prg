package ejemplo04;

public class Pruducto {
			
	
	private String codigo;
	private String nombreM;
	private double precioUnitario;
	private boolean activo;
	
	public Pruducto(String codigo, String nombreM, double precioUnitario, boolean activo) {
		
		this.codigo = codigo;
		this.nombreM = nombreM;
		this.precioUnitario = precioUnitario;
		this.activo = activo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreM() {
		return nombreM;
	}

	public void setNombreM(String nombreM) {
		this.nombreM = nombreM;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

		
	public String toString() {
		return "Pruducto [codigo=" + codigo + ", nombreM=" + nombreM + ", precioUnitario=" + precioUnitario
				+ ", activo=" + activo + "]";
	}
	
}
