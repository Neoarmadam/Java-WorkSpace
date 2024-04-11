package corregidos;

import java.util.Scanner;

public class Escalera {

	public static void main(String[] args) {

		/*
		 * Crea una aplicación que dibuje una escalera de asteriscos. Nosotros le
		 * pasamos la altura de la escalera por teclado. Este es un ejemplo si
		 * insertaras un 5 de altura:
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		// Definición de variables e inicialización del escáner
		int altura = 0;

		Scanner teclado = new Scanner(System.in);
		
		// Pedimos la altura de la escalera
		System.out.println("Introduce la altura de la escalera");
		altura = teclado.nextInt();

		// Bucles for para lograr la escalera de asteriscos
		for (int i = 0; i <= altura; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Cerramos el escáner y finalizamos el programa
		teclado.close();
		
		System.out.println("Fin del programa");

	}

}