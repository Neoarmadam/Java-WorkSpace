package bucles;

import java.util.Scanner;

public class RF_Bucles2 {

	public static void main(String[] args) {

		/*
		 * Crear una variable "nota", pasar su valor por teclado y establecer el texto
		 * que se ha de presentar según la siguiente escala:
		 * 
		 * - Hasta 4 -> Insuficiente
		 * - 5 -> Suficiente
		 * - 6 -> Bien
		 * - 7 u 8 -> Notable
		 * - 9 o 10 -> Sobresaliente
		 */

		// Definición de variables e inicialización del escáner
		int nota;
		
		Scanner teclado = new Scanner(System.in);
		
		// Pedimos la nota por teclado
		System.out.println("Dime la nota del alumno");
		nota = teclado.nextInt();
		
		// Condicionante IF que nos muestra un texto según el valor de la nota
		if(nota >= 0 && nota <= 4 ) {
			System.out.println("Insuficiente");
		} else if(nota == 5) {
			System.out.println("Suficiente");
		} else if (nota == 6) {
			System.out.println("Bien");
		} else if(nota == 7 || nota == 8) {
			System.out.println("Notable");
		} else if(nota == 9 || nota == 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("La nota introducida no es correcta");
		}
		
		// Cerramos teclado y finalizamos el programa
		teclado.close();
		
		System.out.println("Fin del programa");
	}

}
