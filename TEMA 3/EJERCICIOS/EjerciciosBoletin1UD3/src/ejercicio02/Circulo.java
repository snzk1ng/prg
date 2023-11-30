package ejercicio02;

public class Circulo {

	private double radio;

	public Circulo(double radio) {
		
		this.radio = radio;
	}
	
	public double calcularArea() {
		
		double area=0;
		area=Math.PI*Math.pow(radio,2);
		return area;
		
		
	}
	 
		
	
	public double calcularAreaM2(double area) {
		
		double m2;
		double diez=10000.0;
		m2=(double)area/diez;
		return m2;
		
	}
	
	
	
	
}
