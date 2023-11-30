package ejemplo02;

public class Alumno {

	//nota media 
	
	public String nombre;
	public double notaPro;
	public double notaBD;
	
	
	
	public Alumno (String nombre, double notaPro , double notaBD) {
		
		this.nombre = nombre;
		this.notaPro= notaPro;
		this.notaBD= notaBD;
		
		
	}
	
	public double calcularMedia () {
		
		double suma , media ;
		double dos=2;
		suma=notaPro+notaBD;
		media=suma/dos;
		return media;
	}
	
	public void  mostrarMed(double media) {
		
		System.out.printf("La media de %s es de: %.2f",nombre, media);
	}
	
}
