package ejercicio01;

public class Cabecera {

	private String nombreA;
	private String aula;
	private String fecha;
	public Cabecera(String nombreA, String aula, String fecha) {
		this.nombreA = nombreA;
		this.aula = aula;
		this.fecha = fecha;
	}
	
	public void mostrarCab() {
		
		System.out.println("El nombre de la asigtanura es de : "+nombreA);
		System.out.println("El aula es : "+aula);
		System.out.println("El dia es : "+fecha);
		
		
	}
	
	
}
