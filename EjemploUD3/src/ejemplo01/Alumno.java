package ejemplo01;

public class Alumno {

	// atributos
	// no se le añaden valores a las variables, solo en la principal. NUNCA
	// se añade private siempre al atributo
	String nombre;
	int edad;
	double notaMedia;

	// Constructores:

	// Crear objetos con valores
	// lo que va dentro del parentesis, se llama parametros o argumentos
	public Alumno(String nombre, int edad, double notaMedia) {

		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;

	}

	public Alumno(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;

	}

	public Alumno() {

	}
	// Metodos
	
	
	//PRIMER METODO PROPIO, para imprimir bonito
	//Dentro parentesis van los parametros que queremos que haga
	//Dentro de las llaves va el cuerpo 
	public void mostrarDatos (String calle) {
		
		
		System.out.println("Los datos del alumno son:");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Nota Media: "+notaMedia);
		System.out.println("Calle: "+calle);
	}

}
