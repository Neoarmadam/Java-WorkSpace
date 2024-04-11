package bucles;

import java.util.Scanner;

public class Udocz_Bucles5 {

	public static void main(String[] args) {

		/*
		 * Programa que pida una frase y luego pregunte si se quiere introducir otra
		 * frase hasta que se diga que no
		 */

		// Definición de variables e inicialización del escáner
		String frase = "Si";
		int contador = 0;

		Scanner teclado = new Scanner(System.in);

		// Bucle while para pedir frases hasta que se quiera (Para el método
		// .equalsIgnoreCase he tenido que buscar que era)
		while (frase.equalsIgnoreCase("Si")) {
			// Mensaje para introducir la primera frase
			System.out.println("Introduce una frase");
			frase = teclado.nextLine();

			// Mensaje para preguntar si se quiere introducir otra frase
			System.out.println("¿Quieres introducir otra frase?");
			frase = teclado.nextLine();
			contador++;
		}

		// Mostramos las frases que han sido introducidas
		System.out.println("El número de frases introducidas es: " + contador);

		// Cerramos el escáner
		teclado.close();

	}

}
