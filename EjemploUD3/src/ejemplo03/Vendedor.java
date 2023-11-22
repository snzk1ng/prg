package ejemplo03;

public class Vendedor {

		private String nombre;
		private double ventas;
		private int cantV;
		
		public Vendedor(String nombre, double ventas, int cantV) {
			
			this.nombre = nombre;
			this.ventas = ventas;
			this.cantV = cantV;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getVentas() {
			return ventas;
		}

		public void setVentas(double ventas) {
			this.ventas = ventas;
		}

		public int getCantV() {
			return cantV;
		}

		public void setCantV(int cantV) {
			this.cantV = cantV;
		}
		
		
		
		
		
		
	
}
