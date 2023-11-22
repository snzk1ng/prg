package ejemploaleatorio;

import java.util.Random;

import utilidadesd.Leer;

public class Principal {

	public static void main(String[] args) {

		Random num = new Random(System.nanoTime());

		int hasta = 0, desde = 0, tope = 0;
		int ale = 0;

		System.out.println("Digame el hasta");
		hasta = Leer.datoInt();
		System.out.println("Digame el desde");
		desde = Leer.datoInt();
		System.out.println("Digame el tope");
		tope = Leer.datoInt();
		for (int i = 0; i < tope; i++) {
			ale = num.nextInt(hasta - desde + 1) + desde;
			System.out.println(ale);
		}
	}

}
