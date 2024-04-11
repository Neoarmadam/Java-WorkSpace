package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		/*
		 * Programa que pida al usuario un número del 1 al 7 y visualice el nombre del día en función de dicho valor. Si el número que introduce
		 * el usuario no es del 1 al 7 finaliza el programa con un mensaje explicativo.
		*/
		
		//Definición de variables e inicialización del escáner
		int numSemana;
		
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos el número del día de la semana por teclado
		System.out.println("Dime un número del 1 al 7 y te digo a que día de la semana pertenece");
		numSemana = teclado.nextInt();
		
		//Switch que muestra un día de la semana según el número introducido
		switch(numSemana) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Este número no está entre el 1 y el 7 o no has introducido un número");
		    break;
		}
		
		//Fin del programa
		System.out.println("Fin del programa");
		
	}

}
