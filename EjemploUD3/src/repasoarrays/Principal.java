package repasoarrays;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		/*1*/
		Random rdm= new Random(System.nanoTime());
		
		int hasta=1;
		int desde=10;
		int tam;
		int tam2;
		int cambiar;
		int nNum;
		int total=0;
		int contCero=0;
		//Declaracion de arrays, varias formas
		
		//a) dando valores incialmente, incializando
		//Como no damos el tamaño, el tamaño es directamente el numero de elementos que ponemos
		
		int []lista= {2,3,4,5,6,7,8};//tamaño?7 YA SE PODRIA USAR
		
		
		//b) declarando e instanciando en diferentes lineas
		//primero se declara, siempre primero
		
		int lista2[];
		//todavia no se puede usar
		//necesito tamaño, lo pido  
		//declaro variable para guardarlo
		
		System.out.println("Diga el tamaño");
		tam=Leer.datoInt();
		//instancio con ese tamaño
		
		lista2= new int [tam];//El tamaño es leido , ya se podria usar
		//c) TODO EN LA MISMA LINEA
		System.out.println("Diga el tamaño");
		tam2=Leer.datoInt();
		int [] lista3=new int [tam2];

		//el mejor el 2do (b)
		
		
		/*2*/
		//cargar, rellenar el array
		//varias formas
		
		//a) leyendo por teclado
		
		for (int i = 0; i < lista.length; i++) {
			lista[i]=Leer.datoInt();
		}
		
		
		//b) aleatoriamente
		
		for (int i = 0; i < lista3.length; i++) {
			lista[i]=rdm.nextInt(hasta-desde+1)+desde ;
		}
		//c) cascaporra style
		
		int lista4[] = {12,1907,3,4,4,4,4,};
		
		//3. Mostrar el array
		
		
		for (int i = 0; i < lista4.length; i++) {
			System.out.print(" "+lista[i]);
		}
		
		//4. acceso a un solo elemento
		
		System.out.println("Diga que elemento quiere cambiar");
		cambiar=Leer.datoInt()-1;
		System.out.println("ahora el numero que quiere poner");
		nNum=Leer.datoInt();
		
		lista4[cambiar]= nNum;
		for (int i = 0; i < lista4.length; i++) {
			System.out.println(lista4[i]);
		}
		
		//5. SUMAMOS ELEMENTOS 
		for (int i = 0; i < lista4.length; i++) {
			total+=lista4[i];
		}
		
		//operaciones variadas
			for (int i = 0; i < lista4.length; i++) {
				if(lista4[i]%2==0) {
					lista4[i]=lista4[i]*2;
				}
			}
			
		//contar ceros
			for (int i = 0; i < lista4.length; i++) {
				if(lista4[i]==0) {
					contCero++;
				}
			}
			
			for (int i = 0; i < lista4.length; i++) {
				if(lista4[i]>5) {
					lista4[i]=16;
				}
			}
		
			
	}

}
