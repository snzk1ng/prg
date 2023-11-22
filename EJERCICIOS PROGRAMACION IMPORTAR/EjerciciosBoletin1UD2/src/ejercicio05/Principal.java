package ejercicio05;

import Utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		double resultadoT=0;
		double exponenteEm1=0;
		double potNum=0;
		double expNum=0;
		double base=0;
		double resultado=0;
		double cero=0;
		double menosUno=-1;
		System.out.println("Bienvenido al calculo de un exponentee y su potencia");
		System.out.println("");
		System.out.println("Por favor digame un numero que usted desee");
		base=Leer.datoDouble();
		System.out.println("Ahora un exponente");
		expNum=Leer.datoDouble();
		if(expNum==cero) {
			
			System.out.println("El resultado de su operacion es 1");
			
		}
		
		else if (expNum<cero) {
			
		exponenteEm1=expNum*menosUno;	
			
		resultado=Math.pow(base, exponenteEm1);
		
		
		System.out.printf("El resultado de la operacion es 1%.2f\n",resultado, resultadoT);
		
		
		
		
		}
		
		else {
			
		resultado= Math.pow(resultado, base);
		
			
		}
		
		
		
		
		
		
		
		
		

	}

}
