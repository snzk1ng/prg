package ejemplosobrecarga;

public class Operaciones {

	public double sumar(double a, double b) {

		return a + b;

	}
				
	public int sumar(int a, int b) {

		return a + b;

	}
 
	public void sumar(double a, int b) {

		System.out.println(a + b);
	}
}