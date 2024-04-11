package bucles;

public class Udocz_Bucles2 {

	public static void main(String[] args) {

		/*
		 * Programa que nos muestre la suma de los 100 primeros números (El número 100
		 * incluido)
		 */

		// Definición de variables
		int suma = 0;

		// Mensaje inicial
		System.out.println("Te muestro la suma de los 100 primeros números:");

		// Bucle for que suma los 100 primeros números
		for (int i = 0; i <= 100; i++) {
			suma = suma + i;
		}

		// Mostramos la suma total
		System.out.println("El total de la suma de los 100 primeros números es: " + suma);

	}

}
