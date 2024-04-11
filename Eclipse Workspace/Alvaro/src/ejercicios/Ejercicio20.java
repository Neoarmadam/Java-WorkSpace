package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		/*
		 * Programa que pida un número del 1 al 7 asociado a un día de la semana y visualizar si es laborable o festivo.
		*/
		
		//Definición de variables e inicialización del escáner
		int numSemana;
		
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos el número
		System.out.println("Dime un número y te digo si el día es laborable o festivo");
		numSemana = teclado.nextInt();
		
		
		
		//Compara si el día es laborable o festivo (Con if)
		if(numSemana >= 1 && numSemana <= 5) {
			System.out.println("El día es laborable");
			
		}else if(numSemana == 6 || numSemana == 7){
			System.out.println("El día es festivo");
			
		}else
			System.out.println("Número incorrecto o no has introducido un número");
		
		/*
			
		//Compara si el día es laborable o festivo (Con Switch)
		switch(numSemana) {
		case 1,2,3,4,5:
			System.out.println("El día es laborable");
			break;
		case 6,7:
			System.out.println("El día es festivo");
			break;
		default:
			System.out.println("Número incorrecto o no has introducido un número");
		}
		
		*/
		
		//Fin del programa
		System.out.println("Fin del programa");
	}

}
