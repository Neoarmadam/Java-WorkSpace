package Pruebas;

import java.util.Scanner;

public class PruebaEntrada {

	public static void main(String args[]) {
		int num;
		char letra;
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dime un numero");
		num=teclado.nextInt();
		System.out.println(num);
		System.out.println("Dime una letra");
		Scanner teclado2= new Scanner(System.in);
		letra=teclado2.next().charAt(0);
		System.out.println(letra);
	}
}
