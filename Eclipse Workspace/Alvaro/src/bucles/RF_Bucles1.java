package bucles;

import java.util.Scanner;

public class RF_Bucles1 {

	public static void main(String[] args) {

		/*
		 * Cargar dos variables con valores que se pidan por teclado, e indicar cual es
		 * mayor, si son iguales, o si uno es múltiplo de otro. Para probar el programa,
		 * ir cargando distintos valores en las variables.
		 */

		// Definición de variables e inicialización del escáner
		int num1;
		int num2;

		Scanner teclado = new Scanner(System.in);

		// Pedimos los 2 números por teclado
		System.out.println("Introduce el primer número");
		num1 = teclado.nextInt();

		System.out.println("Introduce el segundo número");
		num2 = teclado.nextInt();

		// Condicionante IF para indicar que número de los 2 es mayor o si son iguales
		if (num1 > num2) {
			System.out.println("El número " + num1 + " es mayor que " + num2);
		} else if (num1 < num2) {
			System.out.println("El número " + num2 + " es mayor que " + num1);
		} else {
			System.out.println("El número " + num1 + " y el número " + num2 + " son iguales");
		}

		// Condicionante IF para indicar si un número es múltiplo de otro
		if (num1 % num2 == 0) {
			System.out.println("El número " + num1 + " es múltiplo de " + num2);
		} else if (num2 % num1 == 0) {
			System.out.println("El número " + num2 + " es múltiplo de " + num1);
		} else {
			System.out.println("Ninguno de los 2 números es múltiplo del otro");
		}

		// Cerramos el escáner y finalizamos el programa
		teclado.close();

		System.out.println("Final del programa");

	}

}
