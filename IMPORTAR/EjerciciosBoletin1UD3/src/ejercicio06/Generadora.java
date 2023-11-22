package ejercicio06;

import java.util.Random;

public class Generadora {

	public int generarNum(int desde, int hasta) {

		int num = 0;
		Random rdm = new Random(System.nanoTime());
		num = rdm.nextInt(hasta - desde + 1) + desde;

		return num;

	}

	public int generarPrimitiva(int desde, int hasta) {

		int num = 0;
		num = generarNum(desde, hasta);
		return num;

	}

	public int generarNum1(int desde, int hasta) {
		int num1;
		Random rdm = new Random(System.nanoTime());
		num1 = rdm.nextInt(hasta - desde + 1) + desde;

		return num1;
	}

	public int generarNum2(int desde, int hasta) {

		int num2;
		Random rdm = new Random(System.nanoTime());
		num2 = rdm.nextInt(hasta - desde + 1) + desde;

		return num2;

	}

	public void mostrarTF(int num1, int num2) {
		int cero = 0;
		int dos = 2;
		boolean result;
		if ((num1 + num2) % dos == cero) {
			result = true;
			System.out.println("El numero es:par" );
		} else {
			result = false;
			System.out.println("El numero es:impar ");
		}
	}
	
	public void mostrarQ (int numero) {
		int uno=1;
		int dos=2;
		int tres=3;
		if(numero==uno) {
			System.out.println("Ha seleccionado que gana el equipo local");
		}
		if(numero==dos) {
			System.out.println("Reparto de puntos en el partido");
			
		}
		if(numero==3) {
			System.out.println("Ha seleccionado que el equipo 3 ha ganado");
		}
		
	}
	
	public void mostrarResulQ (int numero) {
		
		int desde=1;
		int hasta=3;
		int num=0;
		
		Random rdm = new Random(System.nanoTime());
		num = rdm.nextInt(hasta - desde + 1) + desde;
		
		if(numero==num) {
			System.out.println("Ha ganado la quiniela");
		}
		else {
			System.out.println("Ha perdido");
		}
		
	}

}
