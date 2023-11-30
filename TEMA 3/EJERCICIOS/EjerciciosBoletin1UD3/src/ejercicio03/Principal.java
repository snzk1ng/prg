package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int num=0;
		
		Operaciones n;
		n=new Operaciones();
		System.out.println("Diga un numero");
		num=Leer.datoInt();
		n.MostrarNum(num);
	}

}
