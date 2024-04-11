package bucles;

import java.util.Scanner;

public class Udocz_Bucles4 {

	public static void main(String[] args) {

		/*
		 * Programa que imprime hasta el número que le pasemos por teclado (este último
		 * incluido)
		 */

		// Definición de variables e inicialización del escáner
		int num;

		Scanner teclado = new Scanner(System.in);

		// Mensaje inicial y pedimos el número por teclado
		System.out.println("Te muestro hasta el número que introduzcas");

		System.out.print("Introduce el número: ");
		num = teclado.nextInt();

		System.out.println();

		// Bucle for que imprime hasta el número introducido
		for (int i = 0; i <= num; i++) {
			System.out.println(i);
		}

		// Cerramos el escáner
		teclado.close();

	}

}
