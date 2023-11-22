package ejercicio07;

import java.util.Random;

public class CaraCruz {

	
	
	
	
	
	
	public boolean Lanzamiento (int hasta , int desde , int lanzamiento ) {
		int uno=1;
		
		boolean result;
		Random rdm = new Random(System.nanoTime());
		lanzamiento = rdm.nextInt(hasta - desde + 1) + desde;
		
		if(lanzamiento==uno) {
			return result=true;
		}
		else {
			return result= false;
		}
		
		
			
	}
	
		
		public void MostrarGanador(boolean result) {
			
			if(result) {
				System.out.println("Ha ganado");
			}
			else{
				System.out.println("Ha perdido");
			}
			
			
		
		
	}
}