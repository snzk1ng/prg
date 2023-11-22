package ejemplobucle;

import utilidadesd.Leer;

public class Principal {

	public static void main(String[] args) {
	
		
		int tope=0;		
				
		int num=0;
		
			System.out.println("Diga un numero");
			num=Leer.datoInt();
			while(num>tope) {
				
				System.out.println("otro num");
				num=Leer.datoInt();
				
			}

	}

}
