package Actividades_UT4_PowerPoint;
	/*
	 * Pedir 2 numeros
	 * Si son iguales se volvera a pedir los numeros
	 * Se mostrara el mayor de los dos
	 */
	import java.util.Scanner;
public class Actividad_49 {
	public static void main (String args[]) {
		//Variables
		Scanner sc =new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Te voy a pedir dos numeros");
		System.out.println("Introduce el primer numero");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo numero");
		num2=sc.nextInt();
		
		while (num1==num2) {
			System.out.println("Los numeros introducidos son iguales, vuelve a introducirlos");
			System.out.println("Introduce el primer numero");
			num1=sc.nextInt();
			System.out.println("Introduce el segundo numero");
			num2=sc.nextInt();
		}
		if (num1>num2) {
			System.out.println("El mayor es: " +num1);
		}else {
			System.out.println("El mayor es: " +num2);
		}
	}

}
