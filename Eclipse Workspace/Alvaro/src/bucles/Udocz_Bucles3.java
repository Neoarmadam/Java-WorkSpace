package bucles;

public class Udocz_Bucles3 {

	public static void main(String[] args) {

		/*
		 * Programa que imprime los números impares hasta 100 y cuenta la cantidad de
		 * ellos
		 */

		// Definición de variables
		int contador = 0;

		// Mensaje inicial
		System.out.println("Te muestro los números impares hasta 100 y la cantidad de ellos");

		// Bucle for que imprime los números impares hasta 100
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
			contador++;
		}

		// Mensaje que indica cuál es la cantidad de números impares hasta 100
		System.out.println();
		System.out.println("La cantidad de números impares hasta llegar a 100 es: " + contador);

	}

}
