package ejercicio02;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {


        double area=0;


        Circulo c1;


        System.out.println("Diga el radio");
        area=Leer.datoDouble();
        c1=new Circulo(area);
        
        
        System.out.printf("El area en cm 2 es cuadradradados es de %.2f \n ", c1.calcularArea());
        System.out.printf("El area en metros 2 es de %.2f ",c1.calcularAreaM2(c1.calcularArea()));





    }

}