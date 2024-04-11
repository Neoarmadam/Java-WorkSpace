package corregidos;

import java.util.*;

public class Actividad27 {
	 public static void main(String[] args) {
	        Scanner t = new Scanner(System.in);
	        int positivos = 0;
	        int numeros = 0;
	        int n=1;

	        while (n!=0) {
	            System.out.print("Introduce un número si es un 0 se cierra ");
	            n =t.nextInt();
	            if (n == 0) {
	            	System.out.println("Fin del programa");
	              break;
	            }
	            numeros++;
	            if (n > 0) {
	                positivos += n;
	            }
	        }

	        System.out.println("Numero de numeros positivos " + positivos);
	        System.out.println("Numero de numeros positivos  " + (numeros + 1));
	        
	    }
}
