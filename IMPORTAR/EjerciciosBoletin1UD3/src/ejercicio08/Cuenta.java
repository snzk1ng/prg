package ejercicio08;

public class Cuenta {

	
	private double saldo;
	private String nombreTit;
	
	public Cuenta(double saldo, String nombreTit) {
	
		this.saldo = saldo;
		this.nombreTit = nombreTit;	
		
	}
	public void IngresarC( double cantidad){
		
		//NO SE ASIGNA EN EL RETURN
		saldo=saldo+cantidad;
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNombreTit() {
		return nombreTit;
	}
	public void setNombreTit(String nombreTit) {
		this.nombreTit = nombreTit;
	}
	public void RetirarS(double retirar ) {
		
			saldo=saldo-retirar;
		}
		

	
	
	public double CalculoDolar() {
		double convDol=0;
		double dolar=1.0;
		double ceroN=0.93;
		
		convDol=(saldo*dolar)/ceroN;
		
		return convDol;
	
	
	}
	
	public void MostrarDolar(double convDol) {
		System.out.println("La conversion al dolar de lo que le queda en la cuenta seria de:" );
		System.out.println(convDol);
		
	}

	public void MostrarSaldo() {
		
		System.out.println("Su saldo actual es : "+getSaldo());
	}
	
	
	
	


}	

