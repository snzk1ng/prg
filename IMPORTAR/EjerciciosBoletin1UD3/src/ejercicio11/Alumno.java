package ejercicio11;

import java.util.Arrays;

public class Alumno {

	
	private String nombreAlumno;
	private String curso;
	private int numeroSuspensos;
	private double notaMedia;
	private double [] notas;
	
	public Alumno(String nombreAlumno, String curso, int numeroSuspensos, double notaMedia, double[] notas) {
		this.nombreAlumno = nombreAlumno;
		this.curso = curso;
		this.numeroSuspensos = numeroSuspensos;
		this.notaMedia = notaMedia;
		this.notas = notas;
	}

	public Alumno() {
	}

	
	public String toString() {
		return "Alumno [nombreAlumno=" + nombreAlumno + ", curso=" + curso + ", numeroSuspensos=" + numeroSuspensos
				+ ", notaMedia=" + notaMedia + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	
}
