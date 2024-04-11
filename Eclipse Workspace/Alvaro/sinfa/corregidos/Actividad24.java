package corregidos;

import java.util.*;

public class Actividad24 {
	public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int producto = 1;
        int numero;

        System.out.println("Introduce números(si es 0 el programa se acabara)");
        System.out.print("Introduce el primer número --> ");
        numero = t.nextInt();

        if (numero == 0) {
            System.out.println("Fin del programa ");
        }else {

	        while (numero != 0) {
	            producto *= numero;
	            System.out.print("Introduce otro número (si es 0 el programa se acabara)--> ");
	            numero = t.nextInt();
	        }

	        System.out.println("El resultado de multiplicar los números ingresados es: " + producto);
    
        }
	}
}

