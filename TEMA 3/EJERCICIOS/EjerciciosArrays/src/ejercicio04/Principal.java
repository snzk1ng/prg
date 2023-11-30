package ejercicio04;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		Random rdm=new Random(System.nanoTime());
		int desde=1;
		int hasta=99;
		int num[];
		int tam=10;
		int cero=0;
		int pulsador=0;
		num= new int[tam];
		System.out.println("Bienvenido al programa");
		
		do {
			
			System.out.println("""
					1.Para continuar
					0.Para salir
					""");
			pulsador=Leer.datoInt();
			switch(pulsador) {
			
			case 1:
				for (int i = 0; i < num.length; i++) {
				num[i]=rdm.nextInt(hasta-desde+1)+desde;
				
				}
			
				for (int i = 0; i < num.length; i++) {
					System.out.println(num[i]);
				}
			break;
			default:
				System.out.println("Incompatible");
				break;
			}
			
			
		}while(pulsador!=cero);
		
		System.out.println("Gracias por usar el programa");
		
		
		
	}

}
