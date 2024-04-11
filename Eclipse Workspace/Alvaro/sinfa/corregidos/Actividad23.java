package corregidos;

import java.util.*;

public class Actividad23 {
	public class MediaNumeros {
	    public static void main(String[] args) {
	        Scanner t= new Scanner(System.in);
	        int nums = 10;
	        int suma = 0;
	        double media;

	        for (int i = 0; i < nums; i++) {
	            System.out.print("Introduce el número " + (i + 1) + "-->");
	            int numero = t.nextInt();
	            suma += numero;
	        }

	        media = suma / nums;
	        System.out.println("La media de los números ingresados es: " + media);
	    }
	}
}
