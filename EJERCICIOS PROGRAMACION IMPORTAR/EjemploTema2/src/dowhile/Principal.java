package dowhile;

import utilidadesd.Leer;

public class Principal {

	public static void main(String[] args) {
	
	
	int num=0;
	int tope=0;
System.out.println("Bienvenido");
		
		
		
		do {
			System.out.println("Diga un num");
			num=Leer.datoInt();
		}while(num>tope);
			
		System.out.println("Adios");
		
		
		
		
		
		
		
	}	

}
