package bucles;

import java.util.Scanner;

public class RF_Bucles5 {

	public static void main(String[] args) {

		/*
		 * Recibir una colección de números desde teclado, calcular su cuadrado y
		 * presentarlo en salida. El bucle debe continuar hasta haber calculado todos
		 * los números que se le entreguen.
		 */

		// Definición de variables e inicialización del escáner
		int num;
		int cuadrado;

		Scanner teclado = new Scanner(System.in);

		// Bucle for que pide 5 números por teclado y calcula su cuadrado
		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce el: " + i + "º número");
			num = teclado.nextInt();
			cuadrado = num * num;
			System.out.println("El cuadrado de: " + num + " es: " + cuadrado);
		}
		
		// Cerramos el escáner y finalizamos el programa
		teclado.close();
		
		System.out.println("Fin del programa");
	}

}
